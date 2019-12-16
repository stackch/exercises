/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/meteo/junit
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.oop.junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.std.jegl.meteo.oop.Meteo;

public class MeteoTestCase {

	@Test
	public void testMin() {
		Meteo meteo = new Meteo(-1.0, 0.0, 1.0);
		assertEquals(-1, meteo.getMin());		
	}
	
	@Test
	public void testMax() {
		Meteo meteo = new Meteo(-1.0, 0.0, 1.0);
		assertEquals(1, meteo.getMax());		
	}

	@Test
	public void testMed() {
		Meteo meteo = new Meteo(-1.0, 0.0, 1.0);
		assertEquals(0, meteo.getMed());		
	}

	@Test
	public void testWuestentag() {
		Meteo meteo = new Meteo(0.0, 35.0);
		assertEquals(true, meteo.isWuestenTag());		
		assertEquals(false, meteo.isHeisserTag());		
		assertEquals(false, meteo.isSommertag());		
		assertEquals(false, meteo.isTropennacht());		
		assertEquals(false, meteo.isFrosttag());		
		assertEquals(false, meteo.isEistag());		
	}

	@Test
	public void testHeissertag() {
		Meteo meteo = new Meteo(0.0, 30.0);
		assertEquals(false, meteo.isWuestenTag());		
		assertEquals(true, meteo.isHeisserTag());		
		assertEquals(false, meteo.isSommertag());		
		assertEquals(false, meteo.isTropennacht());		
		assertEquals(false, meteo.isFrosttag());		
		assertEquals(false, meteo.isEistag());		
	}

	@Test
	public void testSommertag() {
		Meteo meteo = new Meteo(0.0, 25.0);
		assertEquals(false, meteo.isWuestenTag());		
		assertEquals(false, meteo.isHeisserTag());		
		assertEquals(true, meteo.isSommertag());		
		assertEquals(false, meteo.isTropennacht());		
		assertEquals(false, meteo.isFrosttag());		
		assertEquals(false, meteo.isEistag());		
	}

	@Test
	public void testTropennacht() {
		Meteo meteo = new Meteo(20.0, 20.0);
		assertEquals(false, meteo.isWuestenTag());		
		assertEquals(false, meteo.isHeisserTag());		
		assertEquals(false, meteo.isSommertag());		
		assertEquals(true, meteo.isTropennacht());		
		assertEquals(false, meteo.isFrosttag());		
		assertEquals(false, meteo.isEistag());		
	}

	@Test
	public void testFrosttag() {
		Meteo meteo = new Meteo(-1.0, 0.0);
		assertEquals(false, meteo.isWuestenTag());		
		assertEquals(false, meteo.isHeisserTag());		
		assertEquals(false, meteo.isSommertag());		
		assertEquals(false, meteo.isTropennacht());		
		assertEquals(true, meteo.isFrosttag());		
		assertEquals(false, meteo.isEistag());		
	}

	@Test
	public void testEistag() {
		Meteo meteo = new Meteo(-1.0, -1.0);
		assertEquals(false, meteo.isWuestenTag());		
		assertEquals(false, meteo.isHeisserTag());		
		assertEquals(false, meteo.isSommertag());		
		assertEquals(false, meteo.isTropennacht());		
		assertEquals(false, meteo.isFrosttag());		
		assertEquals(true, meteo.isEistag());		
	}

	@Test
	public void testVegetationstag() {
		Meteo meteo = new Meteo(15.0, 15.0);
		assertEquals(true, meteo.isVegetationstag());		
		assertEquals(false, meteo.isHeiztag());		
	}

	@Test
	public void testHeiztag() {
		Meteo meteo = new Meteo(1.0, 1.0);
		assertEquals(false, meteo.isVegetationstag());		
		assertEquals(true, meteo.isHeiztag());		
	}

}
