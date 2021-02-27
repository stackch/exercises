/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.us;

import ch.std.jdpp.abstractfactory.VehicleFactory;

public class FrenchVehicleFactory extends VehicleFactory {

	public FrenchVehicleFactory() {
		addVehicle(new FrenchCar());
		addVehicle(new FrenchBoat());
		addVehicle(new FrenchBike());
	}
}
