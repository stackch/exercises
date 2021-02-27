/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.swiss;

import ch.std.jdpp.abstractfactory.VehicleFactory;

public class SwissVehicleFactory extends VehicleFactory {

	public SwissVehicleFactory() {
		addVehicle(new SwissCar());
		addVehicle(new SwissBoat());
		addVehicle(new SwissBike());
	}
}
