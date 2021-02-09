/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/worditerable
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.worditerable;

public class WordIterableDemo {
	public static void main(String args[]) {
		String s = "Natürlicher Verstand kann fast jeden Grad von Bildung ersetzen, aber keine Bildung den natürlichen Verstand";

		for (String word : new WordIterable(s)) {
			System.out.println(word);
		}
	}
}
