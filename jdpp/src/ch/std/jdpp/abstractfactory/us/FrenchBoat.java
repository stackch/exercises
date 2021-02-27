/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.us;

import ch.std.jdpp.abstractfactory.Boat;
import ch.std.jdpp.abstractfactory.IVehicle;

public class FrenchBoat extends Boat {
	public FrenchBoat() {
		super();
	}


	@Override
	public IVehicle instance() {
		return new FrenchBoat();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a french boat");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a french boat");
	}
}
