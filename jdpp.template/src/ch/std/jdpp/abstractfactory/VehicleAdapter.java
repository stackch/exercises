/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

public abstract class VehicleAdapter implements IVehicle {
	private int max;
	private int available;

	public VehicleAdapter() {
		this(0);
	}

	public VehicleAdapter(int max) {
		this.max = max;
		this.available = max;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
		this.available = max;
	}

	public int getAvailable() {
		return available;
	}

	public void startRent() throws VehicleException {
		if (isRentable() == false) {
			throw new VehicleException("no vehicle available for rent");
		}
		startRentSteps();
		available--;
	}

	public void stopRent() throws VehicleException {
		stopRentSteps();
		available++;
	}

	public boolean isRentable() {
		if (available <= 0) {
			return false;
		}
		return true;
	}

	public abstract void startRentSteps();

	public abstract void stopRentSteps();
}
