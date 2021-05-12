/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/lockutil
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.lockutil.classic;

import java.util.concurrent.locks.Lock;

class TestLockable implements Lockable<String> {

	private Lock testLock;
	
	public TestLockable() {
		this.testLock = LockUtil.newLockInstance();
	}
	
	@Override
	public Lock getLock() {
		return this.testLock;
	}

	@Override
	public String runLocked() {
		System.out.println("TestLockable.runLocked()");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "test";
	}
	
}

public class TestLockUtil {

	public static void main(String[] args) {
		System.out.println("begin");
		String result = LockUtil.runLocked(new TestLockable());
		System.out.println("result = " + result);
		System.out.println("done");
	}
}
