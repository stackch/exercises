/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/data
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

import MeteoData from './MeteoData.js';
import http from 'http';

export default class MeteoDataHttpJSON extends MeteoData {
    constructor(url, callback) {
        super();
        this.url = url;
        this.callback = callback;

        var options = {
            host: 'www.simtech-ag.ch',
            path: '/education/internet/jjas/resources/meteo/http/temperatures.json'
        };
                  
        http.request(options, this.httpCallback.bind(this)).end();
    }

    httpCallback(response) {
        let jsonData = '';        
        //another chunk of data has been received, so append it to `str`
        response.on('data', function (chunk) {
            jsonData += chunk;
        });
        
        let _this = this;
        //the whole response has been received, so we just print it out here
        response.on('end', function () {
            const json = JSON.parse(jsonData);
            _this.min = json[0].value;
            _this.max = json[0].value;
            _this.med = 0;
            for (const t of json) {
                if (_this.min > t.value) {
                    _this.min = t.value;
                }
                if (_this.max < t.value) {
                    _this.max = t.value;
                }
                _this.med += t.value;
            }
            _this.med /= json.length;    
            _this.callback();
        });
    }
}

