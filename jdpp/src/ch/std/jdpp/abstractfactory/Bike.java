/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

public class Bike extends VehicleAdapter {
	public Bike() {
		super();
	}

	public IVehicle instance() {
		return new Bike();
	}

	public void startRentSteps() {
		System.out.println("start renting a bike");
	}

	public void stopRentSteps() {
		System.out.println("stop renting a bike");
	}
}
