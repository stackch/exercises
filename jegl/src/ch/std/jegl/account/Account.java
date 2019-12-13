/*
 * see https://dev.simtech-ag.ch/education/java/jegl/resources/oo/accountrate
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

package ch.std.jegl.account;

public class Account {
	// attributes
	private static double rate = 0.01;
	private String nr;
	private double saldo;

	// constructors
	public Account() {
		this(null, 0.0); // calls master constructor
	}

	public Account(String nr) {
		this(nr, 0.0); // calls master constructor
	}

	/*
	 * master constructor
	 */
	public Account(String nr, double saldo) {
		this.nr = nr;
		this.saldo = saldo;
	}

	// getter / setter
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Account.rate = rate;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Account [nr=" + nr + ", saldo=" + saldo + "]";
	}

}
