/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/oop
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start MeteoOO ...');

class Meteo {
    constructor(ta) {
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

    getMin() {
        return this.min;
    }

    getMax() {
        return this.max;
    }

    getMed() {
        return this.med;
    }

    isWuestenTag() {
		return this.max >= 35;
	}

	isHeisserTag() {
		return this.max >= 30 && !this.isWuestenTag();
	}

	isSommertag() {
		return this.max >= 25 && !this.isHeisserTag();
	}

	isTropennacht() {
		return this.min >= 20;
	}

	isHeiztag() {
		return this.med < 12;
	}

	isVegetationstag() {
		return this.med >= 5;
	}

	isFrosttag() {
		return this.min < 0 && !this.isEistag();
	}

	isEistag() {
		return this.max < 0;
	}
}

function MeteoOO() {
    let ta = [ 19, 25, 28, 29, 24, 21, 20, 18, 23 ]; // Quelle Google
    const wetterfeh = new Meteo(ta);
    console.log("min = ", wetterfeh.getMin());
    console.log("max = ", wetterfeh.getMax());
    console.log("med = ", wetterfeh.getMed().toFixed(2), "\n");
    if (wetterfeh.isWuestenTag()) {
        console.log("Wüstentag");
    }

    if (wetterfeh.isHeisserTag()) {
        console.log("Heisser Tag");
    }

    if (wetterfeh.isSommertag()) {
        console.log("Sommertag");
    }

    if (wetterfeh.isTropennacht()) {
        console.log("Tropennacht");
    }

    if (wetterfeh.isHeiztag()) {
        console.log("Heiztag");
    }
    
    if (wetterfeh.isVegetationstag()) {
        console.log("Vegetationstag");			
    }

    if (wetterfeh.isFrosttag()) {
        console.log("Frosttag");			
    }

    if (wetterfeh.isEistag()) {
        console.log("Eistag");			
    }
}

// run meteo oo method
MeteoOO();

console.log('...MeteoOO Done');
