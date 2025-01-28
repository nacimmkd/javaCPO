package v2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeTest {
	@Test
	void test() {
		Employe pdg = new Employe("PDG", 10000.);
		Employe sct = new Employe("secretaire",1500.);
		
		assertEquals("PDG", pdg.getPoste());
		//assertEquals(0,pdg.getHeuresSup());
		//pdg.ajouterHeuresSup(10);
		//assertEquals(10,pdg.getHeuresSup());
		assertEquals(10000., pdg.getSalaire(), 0.001);
		
		assertEquals("secretaire", sct.getPoste());
		assertEquals(1500., sct.getSalaire(), 0.001);
		//assertEquals(0, sct.getHeuresSup());
		//sct.ajouterHeuresSup(10);
		//assertEquals(10, sct.getHeuresSup());
	}
}
