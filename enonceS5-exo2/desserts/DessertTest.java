package desserts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Suppliment.supChantilly;
import Suppliment.supChocolat;

class DessertTest {
	
	private static Dessert crepe = new Crepe();
	private static Dessert crepeSupChocolat = new supChocolat(crepe);
	private static Dessert crepeSupChocolatEtChantilly = new supChantilly(crepeSupChocolat);
	
	private static Dessert gaufre = new Gaufre();
	private static Dessert gaufreSupChant = new supChantilly(gaufre);
	private static Dessert gaufreSupChantEtChoco = new supChocolat(gaufreSupChant);
	

	@Test
	void testCrepe() {
		assertEquals(crepe.getPrix(), 1.50 , 0.01);
		assertEquals(crepe.toString(), "Crêpe : 1,50 euros");
		assertEquals(crepeSupChocolat.getPrix(), 1.90 , 0.01);
		assertEquals(crepeSupChocolat.toString(), "Crêpe Sup chocolat : 1,90 euros");
		assertEquals(crepeSupChocolatEtChantilly.getPrix(), 2.50 , 0.01);
		assertEquals(crepeSupChocolatEtChantilly.toString(), "Crêpe Sup chocolat Sup chantilly : 2,50 euros");
	}
	
	@Test
	void testChantilly() {
		assertEquals(gaufre.getPrix(), 1.80 , 0.01);
		assertEquals(gaufre.toString(), "Gaufre : 1,80 euros");
		assertEquals(gaufreSupChant.getPrix(), 2.40 , 0.01);
		assertEquals(gaufreSupChant.toString(), "Gaufre Sup chantilly : 2,40 euros");
		assertEquals(gaufreSupChantEtChoco.getPrix(), 2.80 , 0.01);
		assertEquals(gaufreSupChantEtChoco.toString(), "Gaufre Sup chantilly Sup chocolat : 2,80 euros");
	}

}
