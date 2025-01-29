package entreprise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import postes.Employe;
import postes.Planton;
import postes.Secretaire;

class EntrepriseTest {

	@Test
	void test() {
		Entreprise e = new Entreprise();
		Employe pdg = new Employe("PDG", 10000.);
		Employe sct = new Secretaire(1500.);
		Employe pln = new Planton(2000.);
		
		assertEquals(0., e.getMasseSalariale(), 0.001);
		e.ajouterEmploye(pdg);
		assertEquals(10000., e.getMasseSalariale(), 0.001);
		e.ajouterEmploye(sct);
		assertEquals(11500., e.getMasseSalariale(), 0.001);
		pdg.ajouterHeuresSup(10);
		assertEquals(11500., e.getMasseSalariale(), 0.001);
		sct.ajouterHeuresSup(10);
		assertEquals(11650., e.getMasseSalariale(), 0.001);
		
		e.ajouterEmploye(pln);
		assertEquals(13650., e.getMasseSalariale(), 0.001);
		pln.ajouterHeuresSup(10);
		assertEquals(13950., e.getMasseSalariale(), 0.001);
	}
}
