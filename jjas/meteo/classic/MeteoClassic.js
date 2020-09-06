/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/meteo/classic
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/


console.log('Start...');

function MeteoClassic() {
    let ta = [ 19, 25, 28, 29, 24, 21, 20, 18, 23 ]; // Quelle Google
    // compute min, max, mittelwert
    let min = ta[0];
    let max = ta[0];
    let med = 0;
    for (let i = 0; i < ta.length; i++) {
        if (min > ta[i]) {
            min = ta[i];
        }
        if (max < ta[i]) {
            max = ta[i];
        }
        med += ta[i];
    }
    med /= ta.length;
    console.log("min = ", min);
    console.log("max = ", max);
    console.log("med = ", med.toFixed(2), "\n");
    if (max >= 35) {
        console.log("Wüstentag");
    }
    if (max >= 30 && max < 35) {
        console.log("Heisser Tag");
    }
    if (max >= 25 && max < 30) {
        console.log("Sommertag");
    }
    if (min >= 20) {
        console.log("Tropennacht");
    }
    if (med < 12) {
        console.log("Heiztag");
    }
    if (med >= 5) {
        console.log("Vegetationstag");
    }
    if (min < 0 && max >= 0) {
        console.log("Frosttag");
    }
    if (max < 0) {
        console.log("Eistag");
    }
}

// run meteo classic method
MeteoClassic()

console.log('...Done');
