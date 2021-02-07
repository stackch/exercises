/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/reflection/classreflection
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.reflection.classreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("usage: java URLClassLoaderTest [url] [class]");
			System.out.println(
					"example: java URLClassLoaderTest http://localhost/hello.jar ch.std.reflection.HelloClass");
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
					printClass(c);
				} catch (ClassNotFoundException e) {
					System.out.println("class [" + sclass + "] not found");
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}

	public static void printClass(Class<?> c) {
		System.out.println("constructors:");
		Constructor<?>[] constr = c.getConstructors();
		for (int i = 0; i < constr.length; i++) {
			System.out.println(constr[i]);
		}
		System.out.println("methods:");
		Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		System.out.println("fields:");
		Field[] fields = c.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		return;
	}
}