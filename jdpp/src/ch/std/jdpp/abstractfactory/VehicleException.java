/*
 * see https://www.simtech-ag.ch/education/java/jdpp/resources/abstractfactory
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jdpp.abstractfactory;

@SuppressWarnings("serial")
public class VehicleException extends Exception {

	public VehicleException() {
		super();
	}

	public VehicleException(String text) {
		super(text);
	}
}
