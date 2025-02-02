package commande;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestsCommande {
	
	@Test
	void testCommandeFrancaise() {		
		CommandeFrancaise cf = new CommandeFrancaise(1, 50., 5.);
		assertEquals(1, cf.getNumero());
		assertEquals(50., cf.getMontantHT(),0.001);
		assertEquals(5., cf.getFraisLivraison(),0.001);
		double ttc = cf.getMontantTTC();
		assertEquals(65, ttc);		
	}
	
	@Test
	void testCommandeInternationale() {		
		CommandeInternationale ci = new CommandeInternationale(2, 100., "Espagne");
		assertEquals(2, ci.getNumero());
		assertEquals(100., ci.getMontantHT(),0.001);
		assertEquals("Espagne", ci.getPaysLivraison());
		assertEquals(116, ci.getMontantTTC(), 0.001);		
	}
}
