/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/properties
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties {

	public static void main(String[] args) {
		if (args.length < 1) {
		   System.out.println ("no file argument");
		   return;
		}
		Properties properties = new Properties();
		try(FileInputStream fis = new FileInputStream (args[0])) {			
			properties.load (fis);
			System.out.println ("ip alias properties loaded from file [" + args[0] + "]");
			System.out.println (properties);
		} catch(Exception e) {
			System.out.println (e);
		}		
	}
}
