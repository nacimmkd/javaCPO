package commande;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import livraison.livraisonParMontant;
import livraison.livraisonParPoids;

class CommandeTest {
	private static ILivraison livraisonParMontant = new livraisonParMontant();
	private static ILivraison livraisonParPoids = new livraisonParPoids();
	private static Commande com1 = new Commande(20., 3., livraisonParMontant);
	private static Commande com2 = new Commande(15. , 4. , livraisonParPoids);

	@Test
	void test() {
		// test par montant
		assertEquals(com1.getMontant(), 20. , 0.01);
		assertEquals(com1.getPoids(), 3. , 0.01);
		assertEquals(com1.calculerCoutLivraison(), 2. , 0.01);
		
		//test par poids
		assertEquals(com2.getMontant(), 15. , 0.01);
		assertEquals(com2.getPoids(), 4. , 0.01);
		assertEquals(com2.calculerCoutLivraison(), 9. , 0.01);
		
		
	}

}
