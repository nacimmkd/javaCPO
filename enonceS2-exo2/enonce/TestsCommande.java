package enonce;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestsCommande {
	private Client tintin;
	private Produit p1;
	private Produit p2;
	
	@BeforeEach
	public void initDonneesTests() {
		tintin = new Client(1, true);
		p1 = new Produit("D�marreur pour C3", 40, "Automobile");
		p2 = new Produit("Pare-brise avant pour P2008", 60, "Automobile");
	}

	@Test
	void testCommandeFrancaise() {		
		CommandeFrancaise c1 = new CommandeFrancaise(1, "Automobile", tintin);
		c1.ajouterProduit(p1);
		c1.ajouterProduit(p2);
		
		assertEquals(100, c1.getMontantHT());
		assertEquals(100 - (100*0.1) + (100*0.2), c1.getMontantTTC());
	}
	
	@Test
	void testCommandeInternationale() {		
		CommandeInternationale c1 = new CommandeInternationale(2, tintin);	
		c1.setProduit(p2);
		
		assertEquals(60, c1.getMontantHT());
		assertEquals(60 - 0 + (60*0.01), c1.getMontantTTC());
	}

}
