package articles;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DVDTest {
	private static DVD mis�rablesDVD6 = new DVD("Les Mis�rables", 6, 9.0);
	private static DVD mis�rablesDVD12 = new DVD("Les Mis�rables", 12, 14.0);
	private static DVD mis�rablesDVD12bis = new DVD("Les Mis�rables", 12, 14.0);
	@Test
	void test() {
		assertEquals(mis�rablesDVD12.getTitre(),"Les Mis�rables");
		assertEquals(mis�rablesDVD12.getPrixHT(),14.0, 0.001);
		assertEquals(mis�rablesDVD12.getPrixTTC(),16.8, 0.001);
		assertEquals(mis�rablesDVD6.getAgeMini(), 6);
		assertEquals(mis�rablesDVD12.getAgeMini(), 12);
		
		assertEquals(mis�rablesDVD12, mis�rablesDVD12);
		//assertEquals(mis�rablesDVD12, mis�rablesDVD12bis);
		//assertEquals(mis�rablesDVD12bis, mis�rablesDVD12);
		assertFalse(mis�rablesDVD6.equals(mis�rablesDVD12));
	}

}
