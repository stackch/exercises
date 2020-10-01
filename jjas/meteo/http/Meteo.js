/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/data
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

import meteoData from './MeteoData.js';

export default class Meteo {
    constructor(meteoData) {
        this.meteoData = meteoData;
    }

    getMin() {
        return this.meteoData.getMin();
    }

    getMax() {
        return this.meteoData.getMax();
    }

    getMed() {
        return this.meteoData.getMed();
    }

    isWuestenTag() {
		return this.getMax() >= 35;
	}

	isHeisserTag() {
		return this.getMax() >= 30 && !this.isWuestenTag();
	}

	isSommertag() {
		return this.getMax() >= 25 && !this.isHeisserTag();
	}

	isTropennacht() {
		return this.getMin() >= 20;
	}

	isHeiztag() {
		return this.getMed() < 12;
	}

	isVegetationstag() {
		return this.getMed() >= 5;
	}

	isFrosttag() {
		return this.getMin() < 0 && !this.isEistag();
	}

	isEistag() {
		return this.getMax() < 0;
	}
}
