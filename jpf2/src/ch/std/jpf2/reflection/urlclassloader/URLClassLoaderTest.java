/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/reflection/urlclassloader
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.reflection.urlclassloader;

import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("usage: java URLClassLoaderTest [url] [class]");
			System.out.println("example: java URLClassLoaderTest http://localhost/hello.jar ch.std.reflection.HelloClass");
			return;
		}
		String surl = args[0];
		String sclass = args[1];
		System.out.println("Try loading [" + sclass + "] from [" + surl + "] ...");
		try {
			URL url = new URL(surl);
			URL urlList[] = new URL[1];
			urlList[0] = url;
			try (URLClassLoader loader = new URLClassLoader(urlList)) {
				try {
					Class<?> c = loader.loadClass(sclass);
					System.out.println("Class [" + sclass + "] has been loaded");
					// make a new instance
					Object instance = c.getDeclaredConstructor().newInstance();
					System.out.println("instance: " + instance.toString());
				} catch (ClassNotFoundException e) {
					System.out.println("class [" + sclass + "] not found");
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}