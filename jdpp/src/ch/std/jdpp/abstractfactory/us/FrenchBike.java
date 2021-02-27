/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.us;

import ch.std.jdpp.abstractfactory.Bike;
import ch.std.jdpp.abstractfactory.IVehicle;

public class FrenchBike extends Bike {
	public FrenchBike() {
		super();
	}

	@Override
	public IVehicle instance() {
		return new FrenchBike();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a french bike");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a french bike");
	}
}
