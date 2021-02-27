/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory.app;

import ch.std.jdpp.abstractfactory.IVehicle;
import ch.std.jdpp.abstractfactory.VehicleFactory;
import ch.std.jdpp.abstractfactory.VehiclePlace;

public class VehiclePlaceApp {
	public static void main(String[] args) {
		VehiclePlace vp = new VehiclePlace();

		// init vehicle place
		IVehicle car = VehicleFactory.instance("Car", 2);
		vp.add(car);
		IVehicle boat = VehicleFactory.instance("Boat", 5);
		vp.add(boat);
		IVehicle bike = VehicleFactory.instance("Bike", 10);
		vp.add(bike);

		// lets rent
		try {
			vp.startRent(bike);
			vp.startRent(boat);
			vp.startRent(car);
			vp.stopRent(bike);
			vp.stopRent(boat);
			vp.stopRent(car);
		} catch (Exception e) {
			System.out.println(e);
		}
		// lets rent a bike
		try {
			vp.startRent(car);
			vp.startRent(car);
			vp.startRent(car);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
