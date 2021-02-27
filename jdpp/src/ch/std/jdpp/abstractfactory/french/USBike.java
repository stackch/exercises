/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.french;

import ch.std.jdpp.abstractfactory.Bike;
import ch.std.jdpp.abstractfactory.IVehicle;

public class USBike extends Bike {
	public USBike() {
		super();
	}

	@Override
	public IVehicle instance() {
		return new USBike();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a us bike");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a us bike");
	}
}
