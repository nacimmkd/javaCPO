package articles;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlueRayTest {
	
	public static BlueRay b1 = new BlueRay("bluerayDVD", 5, 10);
	public static BlueRay b2 = new BlueRay("bluerayDVD2", 10, 20.2);
	public static BlueRay b3 = new BlueRay("bluerayDVD2", 10, 30.5);

	@Test
	void test() {
		
		// test pour b1
		assertEquals(b1.getTitre(), "bluerayDVD");
		assertEquals(b1.getPrixHT(), 10, 0.001);
		assertEquals(b1.getPrixTTC(), 13, 0.001);
		assertEquals(b1.getAgeMini(), 5);
		assertFalse(b1.pourAdultes());
		
		// test pour b2
		assertEquals(b2.getTitre(), "bluerayDVD2");
		assertEquals(b2.getPrixHT(), 20.2, 0.001);
		assertEquals(b2.getPrixTTC(), 26.26, 0.001);
		assertEquals(b2.getAgeMini(), 10);
		assertTrue(b2.pourAdultes());
		
		assertEquals(b2, b3);
		assertFalse(b1.equals(b3));
		assertFalse(b2.equals(b1));
		assertTrue(b2.equals(b3));
		
	}

}
