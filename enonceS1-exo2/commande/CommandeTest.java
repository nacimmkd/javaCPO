package commande;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import decorator.ICommande;
import decorator.commandeAvecPapierCadeau;
import decorator.commandeAvecPapierOrdinaire;

class CommandeTest {
	
	private static ICommande ordinaireSansEmballage = new CommandeOrdinaire(1, 20.);
	private static ICommande ordinaireEmballageOrdinaire = new commandeAvecPapierOrdinaire(ordinaireSansEmballage);
	private static ICommande ordinaireEmballageOrdinaireEtCadeau = new commandeAvecPapierCadeau(ordinaireEmballageOrdinaire);
	
	private static ICommande urgenteSansEmballage = new CommandeUrgente(2, 10.);
	private static ICommande urgenteEmballageCadeau = new commandeAvecPapierCadeau(urgenteSansEmballage);
	private static ICommande urgenteEmballageCadeauEtOrdinaire = new commandeAvecPapierOrdinaire(urgenteEmballageCadeau);
	
	
	@Test
	void testOrdinaire() {	
		assertEquals(ordinaireSansEmballage.getNumero(), 1);
		assertEquals(ordinaireSansEmballage.getMontant(), 20. , 0.01); // 20
		
		assertEquals(ordinaireEmballageOrdinaire.getNumero(), 1);
		assertEquals(ordinaireEmballageOrdinaire.getMontant(), 22. , 0.01); // 20 + 2 
		
		assertEquals(ordinaireEmballageOrdinaireEtCadeau.getNumero(), 1);
		assertEquals(ordinaireEmballageOrdinaireEtCadeau.getMontant(), 28. , 0.01); // 20 + 2 + 6
	}
	
	@Test
	void testUrgente() {	
		assertEquals(urgenteSansEmballage.getNumero(), 2);
		assertEquals(urgenteSansEmballage.getMontant(), 12. , 0.01); // 12
		
		assertEquals(urgenteEmballageCadeau.getNumero(), 2);
		assertEquals(urgenteEmballageCadeau.getMontant(), 18. , 0.01); // 12 + 6 
		
		assertEquals(urgenteEmballageCadeauEtOrdinaire.getNumero(), 2);
		assertEquals(urgenteEmballageCadeauEtOrdinaire.getMontant(), 20. , 0.01); // 12 + 6 + 2
	}

}
