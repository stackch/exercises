/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/lockutil
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.lockutil.classic;

import java.util.concurrent.locks.Lock;

public interface Lockable<E> {

	public abstract Lock getLock();
	public abstract E runLocked() throws Exception;
	
}
