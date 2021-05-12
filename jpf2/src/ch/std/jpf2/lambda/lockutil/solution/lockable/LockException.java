/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/lockutil
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.lockutil.lambda.lockable;

public class LockException extends Exception {

	private static final long serialVersionUID = 5619158779338557977L;

	public LockException() {
		super();
	}

	public LockException(String message) {
		super(message);
	}

}
