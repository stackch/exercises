/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/meteo/iface
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.iface;

public class Meteo implements IMeteo {
	// attributes
	private IMeteoData meteoData;

	// constructor
	public Meteo(IMeteoData meteoData) {
		this.meteoData = meteoData;
	}

	@Override
	public double getMin() {
		return this.meteoData.getMin();
	}

	@Override
	public double getMax() {
		return this.meteoData.getMax();
	}

	@Override
	public double getMed() {
		return this.meteoData.getMed();
	}

	@Override
	public boolean isWuestenTag() {
		return this.getMax() >= 35.0;
	}

	@Override
	public boolean isHeisserTag() {
		return this.getMax() >= 30.0 && !this.isWuestenTag();
	}

	@Override
	public boolean isSommertag() {
		return this.getMax() >= 25.0 && !this.isHeisserTag();
	}

	@Override
	public boolean isTropennacht() {
		return this.getMin() >= 20.0;
	}

	@Override
	public boolean isHeiztag() {
		return this.getMed() < 12.0;
	}

	@Override
	public boolean isVegetationstag() {
		return this.getMed() >= 5.0;
	}

	@Override
	public boolean isFrosttag() {
		return this.getMin() < 0.0 && !this.isEistag();
	}

	@Override
	public boolean isEistag() {
		return this.getMax() < 0.0;
	}

}
