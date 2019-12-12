/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/basic/ifelse
 */
package ch.std.jegl.ifelse;

public class HttpCodeRange {

	public static void main(String[] args) {

		if (args.length <= 0) {
			System.err.println("no args");
			System.exit(1);
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" +i + "] = " + args[i]);
			int httpCode = Integer.parseInt(args[i]);
			if (httpCode < 200 || httpCode >= 600) {
				System.out.println("httpCode " + httpCode + " is out of range");
				continue;
			}
			if (httpCode >= 200 && httpCode < 300) {
				System.out.println("httpCode " + httpCode + " successful");
				continue;
			}
			if (httpCode >= 300 && httpCode < 400) {
				System.out.println("httpCode " + httpCode + " redirection");
				continue;
			}
			if (httpCode >= 400 && httpCode < 500) {
				System.out.println("httpCode " + httpCode + " client error");
				continue;
			}
			System.out.println("httpCode " + httpCode + " server error");
		}
	}
}
