/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.swiss;

import ch.std.jdpp.abstractfactory.Boat;
import ch.std.jdpp.abstractfactory.IVehicle;

public class SwissBoat extends Boat {
	public SwissBoat() {
		super();
	}


	@Override
	public IVehicle instance() {
		return new SwissBoat();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a swiss boat");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a swiss boat");
	}
}
