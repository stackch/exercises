/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.swiss;

import ch.std.jdpp.abstractfactory.Bike;
import ch.std.jdpp.abstractfactory.IVehicle;

public class SwissBike extends Bike {
	public SwissBike() {
		super();
	}

	@Override
	public IVehicle instance() {
		return new SwissBike();
	}

	@Override
	public void startRentSteps() {
		System.out.println("start renting a swiss bike");
	}

	@Override
	public void stopRentSteps() {
		System.out.println("stop renting a swiss bike");
	}
}
