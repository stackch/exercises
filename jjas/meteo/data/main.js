/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/data
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

import Meteo from './Meteo.js';
import MeteoDataArray from './MeteoDataArray.js';
import MeteoDataJSON from './MeteoDataJSON.js';

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

MeteoRun(new MeteoDataArray([ 19, 25, 28, 29, 24, 21, 20, 18, 23 ]));

const jsonData = `[
    {
        "time": "00:00",
        "value": 19.0
    },
    {
        "time": "03:00",
        "value": 14.0
    },
    {
        "time": "06:00",
        "value": 16.0
    },
    {
        "time": "09:00",
        "value": 20.0
    },
    {
        "time": "12:00",
        "value": 25.0
    },
    {
        "time": "15:00",
        "value": 27.0
    },
    {
        "time": "18:00",
        "value": 24.0
    },
    {
        "time": "21:00",
        "value": 21.0
    }
]`;

MeteoRun(new MeteoDataJSON(jsonData));

console.log('...Meteo Data Done');
