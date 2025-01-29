package postes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeTest {
	@Test
	void test() {
		Employe pdg = new Employe("PDG", 10000.);
		Employe sct = new Secretaire(1500.);
		Employe pln = new Planton(2000.);
		
		assertEquals("PDG", pdg.getPoste());
		assertEquals(0,pdg.getHeuresSup());
		pdg.ajouterHeuresSup(10);
		assertEquals(10,pdg.getHeuresSup());
		assertEquals(10000., pdg.getSalaire(), 0.001);
		assertEquals(10000., pdg.getPaye(), 0.001);
		
		assertEquals("secretaire", sct.getPoste());
		assertEquals(1500., sct.getSalaire(), 0.001);
		assertEquals(0, sct.getHeuresSup());
		sct.ajouterHeuresSup(10);
		assertEquals(10, sct.getHeuresSup());
		assertEquals(1650., sct.getPaye());
		
		
		assertEquals("planton", pln.getPoste());
		assertEquals(2000., pln.getSalaire(), 0.001);
		assertEquals(0, pln.getHeuresSup());
		pln.ajouterHeuresSup(10);
		assertEquals(2000., pln.getSalaire(), 0.001);
		assertEquals(10, pln.getHeuresSup());
		assertEquals(2300., pln.getPaye());
		
	}
}
