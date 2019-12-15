/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/accountrate
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

package ch.std.jegl.account.test;

import ch.std.jegl.account.Account;
import ch.std.jegl.account.AccountException;

class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("111-222-333", 1000.0);
		System.out.println("a: " + a);
		System.out.println("a.getRate() = " + a.getRate());
		Account b = new Account();
		System.out.println("b.getRate() = " + b.getRate());
		b.setRate(-0.05); // for test purposes only, should be called in a static way
		System.out.println("a.getRate() = " + a.getRate());
		System.out.println("b.getRate() = " + b.getRate());
		
		try {
			a.deposit(1000.0);		
		} catch (AccountException e) {
			e.printStackTrace();
		}
		System.out.println("a: " + a);
		try {
			a.deposit(-1000.0);		
		} catch (AccountException e) {
			e.printStackTrace();
		}
		System.out.println("a: " + a);
		try {
			a.withdraw(1000.0);		
		} catch (AccountException e) {
			e.printStackTrace();
		}
		System.out.println("a: " + a);
		try {
			a.withdraw(-1000.0);		
		} catch (AccountException e) {
			e.printStackTrace();
		}
		System.out.println("a: " + a);
		try {
			a.withdraw(10000.0);		
		} catch (AccountException e) {
			e.printStackTrace();
		}
		System.out.println("a: " + a);

	}
}