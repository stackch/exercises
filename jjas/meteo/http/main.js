/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/data
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

import Meteo from './Meteo.js';
import MeteoDataArray from './MeteoDataArray.js';
import MeteoDataHttpJSON from './MeteoDataHttpJSON.js';

console.log('Start Meteo Data ...');

function MeteoRun(meteoData) {
    const wetterfeh = new Meteo(meteoData);
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

let meteoDataHttpJSON = new MeteoDataHttpJSON('https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/http/temperatures.json', () => {
    MeteoRun(meteoDataHttpJSON);
});


console.log('...Meteo Data Done');
