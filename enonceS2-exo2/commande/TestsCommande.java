package commande;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestsCommande {
	private Client tintin;
	private Client nacim; // ajouté
	private Produit p1;
	private Produit p2;
	
	@BeforeEach
	public void initDonneesTests() {
		tintin = new Client(1, true);
		nacim = new Client(2, false); // ajouté
		p1 = new Produit("D�marreur pour C3", 40, "Automobile");
		p2 = new Produit("Pare-brise avant pour P2008", 60, "Automobile");
	}

	@Test
	void testCommandeFrancaise() {		
		CommandeFrancaise c1 = new CommandeFrancaise(1, tintin);
		c1.ajouterProduit(p1);
		c1.ajouterProduit(p2);
		
		assertEquals(100, c1.getMontantHT());
		assertEquals(100 - (100*0.1) + (100*0.2), c1.getMontantTTC());
		
		// autre test
		CommandeFrancaise c2 = new CommandeFrancaise(1, nacim);
		c2.ajouterProduit(p1);
		c2.ajouterProduit(p2);
		
		assertEquals(100, c2.getMontantHT());
		assertEquals(100 - 0 + (100*0.2), c2.getMontantTTC());
	}
	
	@Test
	void testCommandeInternationale() {		
		CommandeInternationale c1 = new CommandeInternationale(2, tintin);	
		c1.setProduit(p2);
		
		assertEquals(60, c1.getMontantHT());
		assertEquals(60 - 0 + (60*0.01), c1.getMontantTTC());
	}

}
