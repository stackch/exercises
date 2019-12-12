/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/basic/switch
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.switchcase;

public class HttpCodeText {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("no argument specified");
			return;
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println("param[" + i + "]: " + args[i]);
			int httpCode = Integer.parseInt(args[i]); // convert String into int
			switch (httpCode) {
			case 200:
				System.out.println("OK");
				break;
			case 201:
				System.out.println("Created");
				break;
			case 202:
				System.out.println("Accepted");
				break;
			case 203:
				System.out.println("Non-Authoritative Information");
				break;
			case 204:
				System.out.println("No Content");
				break;
			case 205:
				System.out.println("Reset Content");
				break;
			case 206:
				System.out.println("Partial Content");
				break;
			case 300:
				System.out.println("Multiple Choices");
				break;
			case 301:
				System.out.println("Moved Permanently");
				break;
			case 302:
				System.out.println("Moved Temporarily");
				break;
			case 303:
				System.out.println("See Other");
				break;
			case 304:
				System.out.println("Not Modified");
				break;
			case 305:
				System.out.println("Use Proxy");
				break;
			case 400:
				System.out.println("Bad Request");
				break;
			case 401:
				System.out.println("Unauthorized");
				break;
			case 402:
				System.out.println("Payment Required");
				break;
			case 403:
				System.out.println("Forbidden");
				break;
			case 404:
				System.out.println("Not Found");
				break;
			case 405:
				System.out.println("Method Not Allowed");
				break;
			case 406:
				System.out.println("Not Acceptable");
				break;
			case 407:
				System.out.println("Proxy Authentication Required");
				break;
			case 408:
				System.out.println("Request Timeout");
				break;
			case 409:
				System.out.println("Conflict");
				break;
			case 410:
				System.out.println("Gone");
				break;
			case 411:
				System.out.println("Length Required");
				break;
			case 412:
				System.out.println("Precondition Failed");
				break;
			case 413:
				System.out.println("Request Entity Too Large");
				break;
			case 414:
				System.out.println("Request-URI Too Long");
				break;
			case 415:
				System.out.println("Unsupported Media Type");
				break;
			case 500:
				System.out.println("Internal Server Error");
				break;
			case 501:
				System.out.println("Not Implemented");
				break;
			case 502:
				System.out.println("Bad Gateway");
				break;
			case 503:
				System.out.println("Service Unavailable");
				break;
			case 504:
				System.out.println("Gateway Timeout");
				break;
			case 505:
				System.out.println("HTTP Version Not Supported");
				break;
			default:
				System.out.println("Out of Scope");
				break;
			}
		}
	}
}
