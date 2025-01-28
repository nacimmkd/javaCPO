package population;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import enonce.TerritoireNonAjoutableEx;
import territoires.Region;
import territoires.Ville;

class PopulationTest {

	@Test
	void test() throws TerritoireNonAjoutableEx{
		ITerritoire idf = new Region("IDF");
		assertEquals("IDF", idf.getNom());
		assertEquals(0, idf.getPop());
		idf.ajouter(new Ville("Paris", 2000000));
		assertEquals(2000000, idf.getPop());
		
		Region d93 = new Region("93");
		d93.ajouter(new Ville("Bobigny", 50000));
		assertEquals(50000, d93.getPop());
		
		Population.fusionner(idf, d93);
		assertEquals(2050000, idf.getPop());
	}

}
