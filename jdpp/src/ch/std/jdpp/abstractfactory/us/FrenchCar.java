/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.us;

import ch.std.jdpp.abstractfactory.Car;
import ch.std.jdpp.abstractfactory.IVehicle;

public class FrenchCar extends Car {
	public FrenchCar() {
		super();
	}

	@Override
	public IVehicle instance() {
		return new FrenchCar();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a french car");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a french car");
	}
}
