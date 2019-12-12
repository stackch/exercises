/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/basic/for
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */
package ch.std.jegl.image;

public class CharImage {

	public static void main(String[] args) {
		final int xDim = 10;
		final int yDim = 10;
		for(int i = 0; i < xDim; i++) {
			for(int j = 0; j < yDim; j++) {
				if (i == j) {
					System.out.print('x');				
				} else {
					System.out.print("&");								
				}
			}
			System.out.println();
		}
	}
}
