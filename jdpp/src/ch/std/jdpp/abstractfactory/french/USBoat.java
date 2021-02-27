/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.french;

import ch.std.jdpp.abstractfactory.Boat;
import ch.std.jdpp.abstractfactory.IVehicle;

public class USBoat extends Boat {
	public USBoat() {
		super();
	}


	@Override
	public IVehicle instance() {
		return new USBoat();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a us boat");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a us boat");
	}
}
