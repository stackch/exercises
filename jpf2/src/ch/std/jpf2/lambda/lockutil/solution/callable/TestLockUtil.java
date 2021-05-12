/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/lockutil
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.lockutil.lambda.callable;

import java.util.concurrent.locks.Lock;

public class TestLockUtil {

	public static void main(String[] args) {
		System.out.println("begin");
		
		Lock lock = LockUtil.newLockInstance();
		
		String result = LockUtil.runLocked(() -> { return lock; }, () -> {
			System.out.println("begin locked");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "test";			
		});
		
		System.out.println("result = " + result);
		System.out.println("done locked");
	}
}
