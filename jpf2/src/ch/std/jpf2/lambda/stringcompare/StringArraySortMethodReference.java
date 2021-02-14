/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/stringcompare
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stringcompare;

import java.util.Arrays;

interface StringCompare {
	public static int compareByLength(String s1, String s2) {
		return s1.length() - s2.length();
	}

	public static int compareByReverseLength(String s1, String s2) {
		return s2.length() - s1.length();
	}

	public static int compareByFirstLetter(String s1, String s2) {
		return s1.charAt(0) - s2.charAt(0);
	}

	public static int compareByContainsE(String s1, String s2) {
		if (s1.contains("e") && !s2.contains("e")) {
			return -1;
		}
		if (s2.contains("e") && !s1.contains("e")) {
			return 1;
		}
		return 0;
	}

}

public class StringArraySortMethodReference {

	public static void main(String[] args) {
		String[] sa = { "john", "peter", "claudia", "emil" };
		sortByLength(sa);
		sortByReverseLength(sa);
		sortByFirstLetter(sa);
		sortByContainsE(sa);
	}

	private static void sortByLength(String[] sa) {
		Arrays.sort(sa, StringCompare::compareByLength);
		System.out.println("sorted by length " + Arrays.asList(sa));
	}

	private static void sortByReverseLength(String[] sa) {
		Arrays.sort(sa, StringCompare::compareByReverseLength);
		System.out.println("sorted by reverese length " + Arrays.asList(sa));
	}

	private static void sortByFirstLetter(String[] sa) {
		Arrays.sort(sa, StringCompare::compareByFirstLetter);
		System.out.println("sorted by first letter " + Arrays.asList(sa));
	}

	private static void sortByContainsE(String[] sa) {
		Arrays.sort(sa, StringCompare::compareByContainsE);
		System.out.println("sorted by contains e first " + Arrays.asList(sa));
	}
}
