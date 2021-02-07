/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/httpcodemap
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.httpcodemap;

import java.util.HashMap;
import java.util.Map;

public class HttpCodeMap {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("no argument specified");
			return;
		}
		try {
			// create hashtable and init them
			Map<Integer,String> httpCodeTable = new HashMap<Integer,String>();
			httpCodeTable.put(200, "OK");
			httpCodeTable.put(201, "Created");
			httpCodeTable.put(202, "Accepted");
			httpCodeTable.put(203, "Non-Authoritative Information");
			httpCodeTable.put(204, "No Content");
			httpCodeTable.put(205, "Reset Content");
			httpCodeTable.put(206, "Partial Content");
			httpCodeTable.put(300, "Multiple Choices");
			httpCodeTable.put(301, "Moved Permanently");
			httpCodeTable.put(302, "Moved Temporarily");
			httpCodeTable.put(303, "See Other");
			httpCodeTable.put(304, "Not Modified");
			httpCodeTable.put(305, "Use Proxy");
			httpCodeTable.put(400, "Bad Request");
			httpCodeTable.put(401, "Unauthorized");
			httpCodeTable.put(402, "Payment Required");
			httpCodeTable.put(403, "Forbidden");
			httpCodeTable.put(404, "Not Found");
			httpCodeTable.put(405, "Method Not Allowed");
			httpCodeTable.put(406, "Not Acceptable");
			httpCodeTable.put(407, "Proxy Authentication Required");
			httpCodeTable.put(408, "Request Timeout");
			httpCodeTable.put(409, "Conflict");
			httpCodeTable.put(410, "Gone");
			httpCodeTable.put(411, "Length Required");
			httpCodeTable.put(412, "Precondition Failed");
			httpCodeTable.put(413, "Request Entity Too Large");
			httpCodeTable.put(414, "Request-URI Too Long");
			httpCodeTable.put(415, "Unsupported Media Type");
			httpCodeTable.put(500, "Internal Server Error");
			httpCodeTable.put(501, "Not Implemented");
			httpCodeTable.put(502, "Bad Gateway");
			httpCodeTable.put(503, "Service Unavailable");
			httpCodeTable.put(504, "Gateway Timeout");
			httpCodeTable.put(505, "HTTP Version Not Supported");
			
			int httpCode = Integer.parseInt(args[0]);
			String text = httpCodeTable.get(httpCode);
			System.out.println("" + httpCode + ": " + text);
		} catch (Exception e) {
			System.out.println(e);
		}
		return;
	}
}