/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/junit/account
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.account.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ch.std.jegl.account.Account;
import ch.std.jegl.account.AccountException;

public class AccountTestCase {

	public static final double AMOUNT = 115.55;

	@Test
	public void testDeposit() throws AccountException {
		Account a = new Account("111-222-333", 0.0);
		a.deposit(AMOUNT);
		assertEquals(AMOUNT, a.getSaldo());
	}

	@Test
	public void testWithdraw() throws AccountException {
		Account a = new Account("111-222-333", AMOUNT);
		a.withdraw(AMOUNT);
		assertEquals(0.0, a.getSaldo());
	}

	@Test
	public void testDepositException() throws AccountException {
		Account a = new Account("111-222-333", 0.0);
		assertThrows(AccountException.class, () ->{
			a.deposit(-AMOUNT);
		});
		assertEquals(0.0, a.getSaldo());
	}

	@Test
	public void testWithdrawException() throws AccountException {
		Account a = new Account("111-222-333", AMOUNT);
		assertThrows(AccountException.class, () ->{
			a.withdraw(-AMOUNT);
		});
		assertEquals(AMOUNT, a.getSaldo());
		assertThrows(AccountException.class, () ->{
			a.withdraw(AMOUNT + AMOUNT);
		});
		assertEquals(AMOUNT, a.getSaldo());	
	}

}
