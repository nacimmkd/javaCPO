package articles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LivreTest {
	private static Livre misÚrables1 = new Livre("Les MisÚrables", false, 8.0);
	private static Livre misÚrables2 = new Livre("Les MisÚrables", false, 8.0);
	private static Livre trone = new Livre("Le Kamasutra", true, 11.0);
	
	@Test
	void test() {
		assertEquals(misÚrables1.getTitre(), "Les MisÚrables");
		assertEquals(misÚrables1.getPrixHT(),8.0, 0.001);
		assertEquals(misÚrables1.getPrixTTC(),8.4, 0.001);
		assertFalse(misÚrables1.pourAdultes());
		
		assertTrue(trone.pourAdultes());
		
		assertEquals(misÚrables1, misÚrables2); 
		assertFalse(misÚrables1.equals(new DVD("Les MisÚrables", 0, 8.0)));
	}

}
