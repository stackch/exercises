/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/ifelse
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start HttpCodeRange ...');

let httpCodes = [100, 200, 300, 404, 500, 600, -1];

for (let i = 0; i < httpCodes.length; i++) {
    const httpCode = httpCodes[i];
    console.log("httpCode = ", httpCode);
    if (httpCode < 200 || httpCode >= 600) {
        console.log("httpCode ", httpCode, " is out of range");
        continue;
    }
    if (httpCode >= 200 && httpCode < 300) {
        console.log("httpCode ", httpCode, " successful");
        continue;
    }
    if (httpCode >= 300 && httpCode < 400) {
        console.log("httpCode ", httpCode, " redirection");
        continue;
    }
    if (httpCode >= 400 && httpCode < 500) {
        console.log("httpCode ", httpCode, " client error");
        continue;
    }
    console.log("httpCode ", httpCode, " server error");
}

console.log('... HttpCodeRange Done');
