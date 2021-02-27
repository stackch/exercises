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

	public IVehicle instance() {
		return new Boat();
	}

	public void startRentSteps() {
		System.out.println("start renting a boat");
	}

	public void stopRentSteps() {
		System.out.println("stop renting a boat");
	}
}
