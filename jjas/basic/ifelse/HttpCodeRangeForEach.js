/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/ifelse
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start HttpCodeRangeForEach ...');

let httpCodes = [100, 200, 300, 404, 500, 600, -1];

httpCodes.forEach(httpCode =>  {
    console.log("httpCode = ", httpCode);
    if (httpCode < 200 || httpCode >= 600) {
        console.log("httpCode ", httpCode, " is out of range");
        return;
    }
    if (httpCode >= 200 && httpCode < 300) {
        console.log("httpCode ", httpCode, " successful");
        return;
    }
    if (httpCode >= 300 && httpCode < 400) {
        console.log("httpCode ", httpCode, " redirection");
        return;
    }
    if (httpCode >= 400 && httpCode < 500) {
        console.log("httpCode ", httpCode, " client error");
        return;
    }
    console.log("httpCode ", httpCode, " server error");
});

console.log('... HttpCodeRangeForEach Done');
