package territoires;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegionTest {
	@Test
	void test() {
		Region r = new Region("IDF");
		assertEquals("IDF", r.getNom());
		assertEquals(0, r.getPop());
		r.ajouter(new Ville("Paris", 2000000));
		assertEquals(2000000, r.getPop());
		
		Region d93 = new Region("93");
		d93.ajouter(new Ville("Bobigny", 50000));
		assertEquals(50000, d93.getPop());
	}
}
