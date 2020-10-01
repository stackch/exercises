/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/data
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

import MeteoData from './MeteoData.js';

export default class MeteoDataArray extends MeteoData {
    constructor(ta) {
        super();
        this.ta = ta;
        this.min = ta[0];
        this.max = ta[0];
        this.med = 0;
        for (let i = 0; i < ta.length; i++) {
            if (this.min > ta[i]) {
                this.min = ta[i];
            }
            if (this.max < ta[i]) {
                this.max = ta[i];
            }
            this.med += ta[i];
        }
        this.med /= ta.length;
    }
}

