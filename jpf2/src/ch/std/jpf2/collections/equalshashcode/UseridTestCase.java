/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/equalsandhashcode
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.equalshashcode;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UseridTestCase {

	@Test
	public void testSameEquals() {
		Userid user1 = new Userid("hans", "123");
		Userid user2 = user1;

		Assert.assertSame(user1, user2);
		Assert.assertEquals(user1, user2);
	}

	@Test
	public void testNotSame() {
		Userid user1 = new Userid("hans", "123");
		Userid user2 = new Userid("peter", "456");

		Assert.assertNotSame(user1, user2);
	}

	@Test
	public void testEquals() {
		Userid user1 = new Userid("hans", "123");
		Userid user2 = new Userid("hans", "123");

		Assert.assertEquals(user1, user2);
	}

	@Test
	public void testHashcode() {
		Userid user1 = new Userid("hans", "123");
		Userid user2 = new Userid("hans", "123");

		Assert.assertEquals(user1.hashCode(), user2.hashCode());
	}

	@Test
	public void testSet() {
		Userid user1 = new Userid("hans", "123");
		Userid user2 = new Userid("hans", "123");
		Userid user3 = new Userid("peter", "456");
		Userid user4 = new Userid("peter", "456");
		
		Set<Userid> useridSet = new HashSet<Userid>();
		useridSet.add(user1);
		useridSet.add(user2);
		useridSet.add(user3);
		useridSet.add(user4);
		
		Assert.assertEquals(2, useridSet.size());
		

	}

}
