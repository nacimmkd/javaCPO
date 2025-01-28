package articles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LivreTest {
	private static Livre mis�rables1 = new Livre("Les Mis�rables", false, 8.0);
	private static Livre mis�rables2 = new Livre("Les Mis�rables", false, 8.0);
	private static Livre trone = new Livre("Le Kamasutra", true, 11.0);
	
	@Test
	void test() {
		assertEquals(mis�rables1.getTitre(), "Les Mis�rables");
		assertEquals(mis�rables1.getPrixHT(),8.0, 0.001);
		assertEquals(mis�rables1.getPrixTTC(),8.4, 0.001);
		assertFalse(mis�rables1.pourAdultes());
		
		assertTrue(trone.pourAdultes());
		
		assertEquals(mis�rables1, mis�rables2); 
		assertFalse(mis�rables1.equals(new DVD("Les Mis�rables", 0, 8.0)));
	}

}
