/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/basic/arraycopy
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

package ch.std.jegl.arraycopy;

import java.util.Arrays;

public class SimpleArrayCopy {

	public static void main(String[] args) {
		System.out.println("Variante Reference Assignment");
		{// variante reference assignment, no copy
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			int[] b = a; // reference assignment
			System.out.println("a (1) = " + Arrays.toString(a));
			System.out.println("b (1) = " + Arrays.toString(b));
			a[0]--; b[0]++;
			System.out.println("a (2) = " + Arrays.toString(a));
			System.out.println("b (2) = " + Arrays.toString(b));			
		}
		System.out.println("Variante 1 (for)");
		{
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			int[] b = new int[a.length];
			// assign each value
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];
			}
			System.out.println("a (1) = " + Arrays.toString(a));
			System.out.println("b (1) = " + Arrays.toString(b));
			a[0]--; b[0]++;
			System.out.println("a (2) = " + Arrays.toString(a));
			System.out.println("b (2) = " + Arrays.toString(b));			
		}
		System.out.println("Variante 2 System.arraycopy");
		{
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			int[] b = new int[a.length];
			System.arraycopy(a, 0, b, 0, a.length);
			System.out.println("a (1) = " + Arrays.toString(a));
			System.out.println("b (1) = " + Arrays.toString(b));
			a[0]--; b[0]++;
			System.out.println("a (2) = " + Arrays.toString(a));
			System.out.println("b (2) = " + Arrays.toString(b));			
		}
		System.out.println("Variante 3 (clone)");
		{
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			int[] b = a.clone();
			System.out.println("a (1) = " + Arrays.toString(a));
			System.out.println("b (1) = " + Arrays.toString(b));
			a[0]--; b[0]++;
			System.out.println("a (2) = " + Arrays.toString(a));
			System.out.println("b (2) = " + Arrays.toString(b));			
		}
		System.out.println("Variante 4 (Arrays.copyOf)");
		{
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			int[] b = Arrays.copyOf(a, a.length);
			System.out.println("a (1) = " + Arrays.toString(a));
			System.out.println("b (1) = " + Arrays.toString(b));
			a[0]--; b[0]++;
			System.out.println("a (2) = " + Arrays.toString(a));
			System.out.println("b (2) = " + Arrays.toString(b));			
		}
	}
}
