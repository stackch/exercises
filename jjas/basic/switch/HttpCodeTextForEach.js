/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/switch
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start HttpCodeTextForEach ...');

let httpCodes = [100, 200, 300, 404, 500, 600, -1];

httpCodes.forEach(httpCode =>  {
    switch (httpCode) {
        case 100:
            console.log(httpCode + " = Continue");
            break;
        case 200:
            console.log(httpCode + " = OK");
            break;
        case 201:
            console.log(httpCode + " = Created");
            break;
        case 202:
            console.log(httpCode + " = Accepted");
            break;
        case 203:
            console.log(httpCode + " = Non-Authoritative Information");
            break;
        case 204:
            console.log(httpCode + " = No Content");
            break;
        case 205:
            console.log(httpCode + " = Reset Content");
            break;
        case 206:
            console.log(httpCode + " = Partial Content");
            break;
        case 300:
            console.log(httpCode + " = Multiple Choices");
            break;
        case 301:
            console.log(httpCode + " = Moved Permanently");
            break;
        case 302:
            console.log(httpCode + " = Moved Temporarily");
            break;
        case 303:
            console.log(httpCode + " = See Other");
            break;
        case 304:
            console.log(httpCode + " = Not Modified");
            break;
        case 305:
            console.log(httpCode + " = Use Proxy");
            break;
        case 400:
            console.log(httpCode + " = Bad Request");
            break;
        case 401:
            console.log(httpCode + " = Unauthorized");
            break;
        case 402:
            console.log(httpCode + " = Payment Required");
            break;
        case 403:
            console.log(httpCode + " = Forbidden");
            break;
        case 404:
            console.log(httpCode + " = Not Found");
            break;
        case 405:
            console.log(httpCode + " = Method Not Allowed");
            break;
        case 406:
            console.log(httpCode + " = Not Acceptable");
            break;
        case 407:
            console.log(httpCode + " = Proxy Authentication Required");
            break;
        case 408:
            console.log(httpCode + " = Request Timeout");
            break;
        case 409:
            console.log(httpCode + " = Conflict");
            break;
        case 410:
            console.log(httpCode + " = Gone");
            break;
        case 411:
            console.log(httpCode + " = Length Required");
            break;
        case 412:
            console.log(httpCode + " = Precondition Failed");
            break;
        case 413:
            console.log(httpCode + " = Request Entity Too Large");
            break;
        case 414:
            console.log(httpCode + " = Request-URI Too Long");
            break;
        case 415:
            console.log(httpCode + " = Unsupported Media Type");
            break;
        case 500:
            console.log(httpCode + " = Internal Server Error");
            break;
        case 501:
            console.log(httpCode + " = Not Implemented");
            break;
        case 502:
            console.log(httpCode + " = Bad Gateway");
            break;
        case 503:
            console.log(httpCode + " = Service Unavailable");
            break;
        case 504:
            console.log(httpCode + " = Gateway Timeout");
            break;
        case 505:
            console.log(httpCode + " = HTTP Version Not Supported");
            break;
        default:
            console.log(httpCode + " = Out of Scope");
            break;
    }
});

console.log('... HttpCodeTextForEach Done');
