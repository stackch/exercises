/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/data
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

import MeteoData from './MeteoData.js';

export default class MeteoDataJSON extends MeteoData {
    constructor(jsonData) {
        super();
        const json = JSON.parse(jsonData);
        this.min = json[0].value;
        this.max = json[0].value;
        this.med = 0;
        for (const t of json) {
            if (this.min > t.value) {
                this.min = t.value;
            }
            if (this.max < t.value) {
                this.max = t.value;
            }
            this.med += t.value;
        }
        this.med /= json.length;
    }
}

