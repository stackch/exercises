/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.swiss;

import ch.std.jdpp.abstractfactory.Car;
import ch.std.jdpp.abstractfactory.IVehicle;

public class SwissCar extends Car {
	public SwissCar() {
		super();
	}

	
	@Override
	public IVehicle instance() {
		return new SwissCar();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a swiss car");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a swiss car");
	}
}
