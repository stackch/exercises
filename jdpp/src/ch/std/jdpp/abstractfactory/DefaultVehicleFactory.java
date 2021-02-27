package ch.std.jdpp.abstractfactory;

public class DefaultVehicleFactory extends VehicleFactory {

	public DefaultVehicleFactory() {
		addVehicle(new Car());
		addVehicle(new Boat());
		addVehicle(new Bike());
	}
}
