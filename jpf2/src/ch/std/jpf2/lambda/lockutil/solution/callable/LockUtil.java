/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/lockutil
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.lockutil.lambda.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

public class LockUtil {

	public static Lock newLockInstance() {
	    return new ReentrantLock();	
	}
	
	/**
	 * This methods waits until given lock is free.
	 * 
	 * There is no timeout support and a deadlock may occure.
	 * 
	 * @param lockable
	 */
	public static <E> E runLocked(Supplier<Lock> supplier, Callable<E> callable) {
		Lock lock = supplier.get();
		if (lock == null) {
			throw new NullPointerException("lock is null");
		}
		E obj = null;
		try {
			lock.lock();
			obj = callable.call();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return obj;
	}

}
