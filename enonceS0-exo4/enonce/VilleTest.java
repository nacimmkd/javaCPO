package enonce;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VilleTest {

	@Test
	void test() {
		Ville v = new Ville("Paris", 2000000);
		assertEquals("Paris", v.getNom());
		assertEquals(2000000, v.getPop());
	}

}
