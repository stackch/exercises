/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

public class Car extends VehicleAdapter {
	public Car() {
		super();
	}

	@Override
	public String getKey() {
		return "Car";
	}
	
	@Override
	public IVehicle instance() {
		return new Car();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a car");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a car");
	}
}
