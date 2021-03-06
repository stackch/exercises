/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

public class Boat extends VehicleAdapter {
	public Boat() {
		super();
	}

	@Override
	public String getKey() {
		return "Boat";
	}

	@Override
	public IVehicle instance() {
		return new Boat();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a boat");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a boat");
	}
}
