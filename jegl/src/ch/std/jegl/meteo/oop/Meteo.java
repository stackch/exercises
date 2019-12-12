/*
 * see https://dev.simtech-ag.ch/education/java/jegl/resources/meteo/oop
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.oop;

public class Meteo {
	// attributes
	private double min;
	private double max;
	private double med;

	// constructor
	public Meteo(double[] ta) {
		init(ta);
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public double getMed() {
		return med;
	}

	public boolean isWuestenTag() {
		return this.max >= 35.0;
	}

	public boolean isHeisserTag() {
		return this.max >= 30.0 && !this.isWuestenTag();
	}

	public boolean isSommertag() {
		return this.max >= 25.0 && !this.isHeisserTag();
	}

	public boolean isTropennacht() {
		return this.min >= 20.0;
	}

	public boolean isHeiztag() {
		return this.med < 12.0;
	}

	public boolean isVegetationstag() {
		return this.med >= 5.0;
	}

	public boolean isFrosttag() {
		return this.min < 0.0 && !this.isEistag();
	}

	public boolean isEistag() {
		return this.max < 0.0;
	}

	private void init(double[] ta) {
		this.min = ta[0];
		this.max = ta[0];
		this.med = 0.0;
		for (double t : ta) {
			if (this.max < t) {
				this.max = t;
			}
			if (this.min > t) {
				this.min = t;
			}
			this.med += t;
		}
		this.med /= ta.length;
	}

}
