/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/stringcompare
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stringcompare;

import java.util.Arrays;

public class StringArraySort {

	public static void main(String[] args) {
		String[] sa = { "john", "peter", "claudia", "emil" };
		sortByLength(sa);
		sortByReverseLength(sa);
		sortByFirstLetter(sa);
		sortByContainsE(sa);
	}

	private static void sortByLength(String[] sa) {
		Arrays.sort(sa, (s1, s2) -> s1.length() - s2.length());
		System.out.println("sorted by length " + Arrays.asList(sa));
	}

	private static void sortByReverseLength(String[] sa) {
		Arrays.sort(sa, (s1, s2) -> s2.length() - s1.length());
		System.out.println("sorted by reverese length " + Arrays.asList(sa));
	}

	private static void sortByFirstLetter(String[] sa) {
		Arrays.sort(sa, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println("sorted by first letter " + Arrays.asList(sa));
	}

	private static void sortByContainsE(String[] sa) {
		Arrays.sort(sa, (s1, s2) -> {
			if (s1.contains("e") && !s2.contains("e")) {
				return -1;
			} 
			if (s2.contains("e") && !s1.contains("e")) {
				return 1;
			}
			return 0;
		});
		System.out.println("sorted by contains e first " + Arrays.asList(sa));
	}
}
