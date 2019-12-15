/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/accountexception
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

package ch.std.jegl.account;

public class AccountException extends Exception {

	private static final long serialVersionUID = -6946020869627709743L;

	public AccountException() {
		super();
	}

	public AccountException(String message) {
		super(message);
	}

}
