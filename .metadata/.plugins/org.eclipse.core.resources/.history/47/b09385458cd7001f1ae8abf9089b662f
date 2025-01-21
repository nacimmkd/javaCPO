package v2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PileTest {

	@Test
	void test() {
		Pile p = new Pile(2);
		assertTrue(p.estVide());
		assertFalse(p.estPleine());
		
		p.empiler(5);
		assertFalse(p.estVide());
		assertFalse(p.estPleine());
		assertEquals(p.getSommet(),5);
		
		p.empiler(7);
		assertFalse(p.estVide());
		assertTrue(p.estPleine());
		assertEquals(p.getSommet(),7);
		
		assertEquals(p.depiler(),7);
		assertFalse(p.estVide());
		assertFalse(p.estPleine());
		assertEquals(p.getSommet(),5);
		
		assertEquals(p.depiler(),5);
		assertTrue(p.estVide());
		assertFalse(p.estPleine());
	}

}
