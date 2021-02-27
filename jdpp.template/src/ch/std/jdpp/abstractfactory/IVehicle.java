/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

public interface IVehicle {
	public IVehicle instance();

	public void startRent() throws VehicleException;

	public void stopRent() throws VehicleException;

	public int getMax();

	public void setMax(int max);

	public int getAvailable();
}
