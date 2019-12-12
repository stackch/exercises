/*
 * see https://dev.simtech-ag.ch/education/java/jegl/resources/meteo/classic
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.classic;

public class MeteoClassic {

	public static void main(String[] args) {
		double[] ta = { 0.0, 1.0, -1.0, -3.0, -3.0, -3.0, -1.0, 3.0, 3.0 }; // Quelle Google
		// compute min, max, mittelwert
		double min = ta[0];
		double max = ta[0];
		double med = 0.0;
		for (int i = 0; i < ta.length; i++) {
			if (min > ta[i]) {
				min = ta[i];
			}
			if (max < ta[i]) {
				max = ta[i];
			}
			med += ta[i];
		}
		med /= ta.length;
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		System.out.printf("med = %.2f\n", med);
		if (max >= 35.0) {
			System.out.println("Wüstentag");
		}
		if (max >= 30.0 && max < 35.0) {
			System.out.println("Heisser Tag");
		}
		if (max >= 25.0 && max < 30.0) {
			System.out.println("Sommertag");
		}
		if (min >= 20.0) {
			System.out.println("Tropennacht");
		}
		if (med < 12.0) {
			System.out.println("Heiztag");
		}
		if (med >= 5.0) {
			System.out.println("Vegetationstag");
		}
		if (min < 0.0 && max >= 0.0) {
			System.out.println("Frosttag");
		}
		if (max < 0.0) {
			System.out.println("Eistag");
		}
	}
}
