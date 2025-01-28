package articles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LivreTest {
	private static Livre misérables1 = new Livre("Les Misérables", false, 8.0);
	private static Livre misérables2 = new Livre("Les Misérables", false, 8.0);
	private static Livre trone = new Livre("Le Kamasutra", true, 11.0);
	
	@Test
	void test() {
		assertEquals(misérables1.getTitre(), "Les Misérables");
		assertEquals(misérables1.getPrixHT(),8.0, 0.001);
		assertEquals(misérables1.getPrixTTC(),8.4, 0.001);
		assertFalse(misérables1.pourAdultes());
		
		assertTrue(trone.pourAdultes());
		
		assertEquals(misérables1, misérables2); 
		assertFalse(misérables1.equals(new DVD("Les Misérables", 0, 8.0)));
	}

}
