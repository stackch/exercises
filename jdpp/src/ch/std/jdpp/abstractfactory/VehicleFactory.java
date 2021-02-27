/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

import java.util.HashMap;
import java.util.Map;

import ch.std.jdpp.abstractfactory.french.USVehicleFactory;
import ch.std.jdpp.abstractfactory.swiss.SwissVehicleFactory;
import ch.std.jdpp.abstractfactory.us.FrenchVehicleFactory;

public class VehicleFactory {
	protected Map<String, IVehicle> vehicles = new HashMap<>();
	protected static Map<String, VehicleFactory> factoryMap = new HashMap<>();

	static {
		factoryMap.put("ch", new SwissVehicleFactory());	
		factoryMap.put("us", new USVehicleFactory());
		factoryMap.put("fr", new FrenchVehicleFactory());
	}
	
	public VehicleFactory() {
	}

	public static VehicleFactory createFactory() {
		return createFactory(null);
	}

	public static VehicleFactory createFactory(String key) {
		if (key == null) {
			return new DefaultVehicleFactory();
		}
		return (VehicleFactory) factoryMap.get(key);
	}

	public void addVehicle(IVehicle vehicle) {
		vehicles.put(vehicle.getKey(), vehicle);
	}

	public IVehicle instance(String name) {
		IVehicle v = (IVehicle) vehicles.get(name);
		return v;
	}

	public IVehicle instance(String name, int max) {
		IVehicle v = (IVehicle) vehicles.get(name);
		v.setMax(max);
		return v;
	}
}
