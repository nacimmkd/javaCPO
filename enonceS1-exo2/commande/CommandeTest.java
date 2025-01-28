package commande;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import decorator.ICommande;
import decorator.commandeAvecPapierCadeau;
import decorator.commandeAvecPapierOrdinaire;

class CommandeTest {
	
	private static ICommande ordinaireSansEmballage = new CommandeOrdinaire(1, 20.);
	private static ICommande urgenteSansEmballage = new CommandeUrgente(2, 10.);
	private static ICommande ordinaireAvecEmballageOrdinaire = new commandeAvecPapierOrdinaire(ordinaireSansEmballage);
	private static ICommande ordinaireAvecEmballageCadeau = new commandeAvecPapierCadeau(ordinaireSansEmballage);
	private static ICommande urgenteAvecEmballageOrdinaire = new commandeAvecPapierOrdinaire(urgenteSansEmballage);
	
	@Test
	void test1() {	
		assertEquals(ordinaireSansEmballage.getNumero(), 1);
		assertEquals(ordinaireSansEmballage.getMontant(), 20. , 0.01);
		
		assertEquals(ordinaireAvecEmballageOrdinaire.getNumero(), 1);
		assertEquals(ordinaireAvecEmballageOrdinaire.getMontant(), 22. , 0.01);
		
		assertEquals(ordinaireAvecEmballageCadeau.getNumero(), 1);
		assertEquals(ordinaireAvecEmballageCadeau.getMontant(), 26. , 0.01);
	
	}

}
