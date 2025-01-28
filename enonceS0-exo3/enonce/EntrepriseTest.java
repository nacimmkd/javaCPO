package enonce;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EntrepriseTest {

	@Test
	void test() {
		Entreprise e = new Entreprise();
		Employe pdg = new Employe("PDG", 10000.);
		Employe sct = new Employe("secretaire",1500.);
		
		assertEquals(0., e.getMasseSalariale(), 0.001);
		e.ajouterEmploye(pdg);
		assertEquals(10000., e.getMasseSalariale(), 0.001);
		e.ajouterEmploye(sct);
		assertEquals(11500., e.getMasseSalariale(), 0.001);
		pdg.ajouterHeuresSup(10);
		assertEquals(11500., e.getMasseSalariale(), 0.001);
		sct.ajouterHeuresSup(10);
		assertEquals(11650., e.getMasseSalariale(), 0.001);
	}
}
