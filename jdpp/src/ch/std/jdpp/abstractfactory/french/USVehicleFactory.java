/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.french;

import ch.std.jdpp.abstractfactory.VehicleFactory;

public class USVehicleFactory extends VehicleFactory {

	public USVehicleFactory() {
		addVehicle(new USCar());
		addVehicle(new USBoat());
		addVehicle(new USBike());
	}
}
