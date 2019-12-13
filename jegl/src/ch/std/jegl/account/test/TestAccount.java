/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/accountrate
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

package ch.std.jegl.account.test;

import ch.std.jegl.account.Account;

class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println("a: " + a);
		a.setSaldo(a.getSaldo() - 2000.0);
		System.out.println("a: " + a);
		System.out.println("a.getRate() = " + a.getRate());
		Account b = new Account();
		System.out.println("b.getRate() = " + b.getRate());
		b.setRate(-0.05); // for test purposes only, should be called in a static way
		System.out.println("a.getRate() = " + a.getRate());
		System.out.println("b.getRate() = " + b.getRate());
	}
}