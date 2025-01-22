package articles;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DVDTest {
	private static DVD misérablesDVD6 = new DVD("Les Misérables", 6, 9.0);
	private static DVD misérablesDVD12 = new DVD("Les Misérables", 12, 14.0);
	private static DVD misérablesDVD12bis = new DVD("Les Misérables", 12, 14.0);
	@Test
	void test() {
		assertEquals(misérablesDVD12.getTitre(),"Les Misérables");
		assertEquals(misérablesDVD12.getPrixHT(),14.0, 0.001);
		assertEquals(misérablesDVD12.getPrixTTC(),16.8, 0.001);
		assertEquals(misérablesDVD6.getAgeMini(), 6);
		assertEquals(misérablesDVD12.getAgeMini(), 12);
		
		assertEquals(misérablesDVD12, misérablesDVD12);
		//assertEquals(misérablesDVD12, misérablesDVD12bis);
		//assertEquals(misérablesDVD12bis, misérablesDVD12);
		assertFalse(misérablesDVD6.equals(misérablesDVD12));
	}

}
