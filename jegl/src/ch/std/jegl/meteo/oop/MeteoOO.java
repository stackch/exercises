/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/meteo/oop
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.oop;

public class MeteoOO {

	public static void main(String[] args) {
		double[] ta = { 7, 6, 6, 5, 5, 3, 3, 4, 4 };
		Meteo wetterfeh = new Meteo(ta);
		System.out.println("max = " + wetterfeh.getMax());
		System.out.println("min = " + wetterfeh.getMin());
		System.out.printf("med = %.2f\n", wetterfeh.getMed());

		if (wetterfeh.isWuestenTag()) {
			System.out.println("Wüstentag");
		}

		if (wetterfeh.isHeisserTag()) {
			System.out.println("Heisser Tag");
		}

		if (wetterfeh.isSommertag()) {
			System.out.println("Sommertag");
		}

		if (wetterfeh.isTropennacht()) {
			System.out.println("Tropennacht");
		}

		if (wetterfeh.isHeiztag()) {
			System.out.println("Heiztag");
		}

		if (wetterfeh.isVegetationstag()) {
			System.out.println("Vegetationstag");
		}

		if (wetterfeh.isFrosttag()) {
			System.out.println("Frosttag");
		}

		if (wetterfeh.isEistag()) {
			System.out.println("Eistag");
		} 

	}

}
