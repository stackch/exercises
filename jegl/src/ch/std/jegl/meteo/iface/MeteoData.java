/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/meteo/iface
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.iface;

public class MeteoData implements IMeteoData {
	// attributes
	private double min;
	private double max;
	private double med;

	// constructor
	public MeteoData(double... ta) {
		init(ta);
	}

	@Override
	public double getMin() {
		return min;
	}

	@Override
	public double getMax() {
		return max;
	}

	@Override
	public double getMed() {
		return med;
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
