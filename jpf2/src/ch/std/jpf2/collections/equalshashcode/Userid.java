/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/equalsandhashcode
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.equalshashcode;

public class Userid {

	private String userid;
	private String password;

	public Userid() {
		this("", "");
	}

	public Userid(String userid) {
		this(userid, "");
	}

	public Userid(String userid, String password) {
		super();
		this.password = password;
		this.userid = userid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Userid) {
			Userid userid = (Userid)obj;
			if (!this.userid.equals(userid.userid)) {
				return false;
			}
			if (!this.password.equals(userid.password)) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hashCode = this.userid.hashCode();
		hashCode += 31 * this.password.hashCode();
		return hashCode;
	}
	
	@Override
	public String toString() {
		return "userid:" + userid + ", password:" + password;
	}

}
