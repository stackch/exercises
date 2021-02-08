/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/properties
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.properties;

import java.util.Properties;
import java.io.FileOutputStream;

public class SaveProperties {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("no file argument");
			return;
		}
		Properties properties = new Properties();
		properties.setProperty("www.switch.ch", "130.59.10.30");
		properties.setProperty("www.simtech-ag.ch", "212.28.143.28");
		properties.setProperty("www.ietf.org", "4.17.168.6");
		properties.setProperty("www.w3.org", "18.29.1.34");

		try (FileOutputStream fos = new FileOutputStream(args[0])) {
			properties.store(fos, "java collections: ip alias properties");
			System.out.println("ip alias properties stored in file [" + args[0] + "]");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}