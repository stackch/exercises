/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehiclePlace {
	private List<IVehicle> vehicleList;

	public VehiclePlace() {
		vehicleList = new ArrayList<>();
	}

	public void add(IVehicle v) {
		remove(v);
		vehicleList.add(v);
		return;
	}

	public void remove(IVehicle v) {
		Iterator<IVehicle> iterator = vehicleList.iterator();
		while (iterator.hasNext()) {
			IVehicle vv = (IVehicle) iterator.next();
			if (v == vv) {
				iterator.remove();
			}
		}
	}

	public void startRent(IVehicle vehicle) throws VehicleException {
		vehicle.startRent();
	}

	public void stopRent(IVehicle vehicle) throws VehicleException {
		vehicle.stopRent();
	}
}
