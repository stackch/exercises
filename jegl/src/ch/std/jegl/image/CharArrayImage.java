/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/basic/chararrayimage
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.image;

public class CharArrayImage {

	public static void main(String[] args) {
		char[][] image = new char[10][10];
		// init the image
		for(int i = 0; i < image.length; i++) {
			for(int j = 0; j < image[i].length; j++) {
				if (i == j) {
					image[i][j] = 'x';
				} else {
					image[i][j] = '&';
				}
			}
		}
		// print the image
		for(int i = 0; i < image.length; i++) {
			for(int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j]);
			}
			System.out.println();
		}
	}
}
