/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/lockutil
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.lockutil.lambda.lockable;

import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;

@FunctionalInterface
public interface Lockable<E> {

	public abstract E runLocked() throws Exception;

	public default Lock getLock(Supplier<Lock> supplier) {
		return supplier.get();
	}
}
