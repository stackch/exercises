/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
	private static Map<String, IVehicle> vehicles;

	static {
		vehicles = new HashMap<>();
		vehicles.put("Car", new Car());
		vehicles.put("Boat", new Boat());
		vehicles.put("Bike", new Bike());
	}

	public VehicleFactory() {
	}

	public static synchronized IVehicle instance(String name) {
		IVehicle v = (IVehicle) vehicles.get(name);
		return v;
	}

	public static synchronized IVehicle instance(String name, int max) {
		IVehicle v = (IVehicle) vehicles.get(name);
		v.setMax(max);
		return v;
	}
}
