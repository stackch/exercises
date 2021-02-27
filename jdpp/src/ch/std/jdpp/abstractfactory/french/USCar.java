/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.french;

import ch.std.jdpp.abstractfactory.Car;
import ch.std.jdpp.abstractfactory.IVehicle;

public class USCar extends Car {
	public USCar() {
		super();
	}

	
	@Override
	public IVehicle instance() {
		return new USCar();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a us car");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a us car");
	}
}
