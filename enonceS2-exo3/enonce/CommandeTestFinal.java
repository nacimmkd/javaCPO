package enonce;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CommandeTestFinal {

	@Test
	void test() {
		Commande cde = new Commande(1);
		assertEquals(1, cde.getNumero());
		assertFalse(cde.estPayee());

		// on ne peut pas livrer une cde non payee
		assertThrows(CdeNonLivrableEx.class, 
				() -> { cde.livrer(); }
			);

		// on ne peut pas rembourser une cde non payee
		assertThrows(CdeNonRemboursableEx.class,
				()->{ cde.rembourser(); }
			);

		cde.payer();
		assertTrue(cde.estPayee());

		// on ne peut pas payer une cde deja payee
		assertThrows(CdeNonPayableEx.class,
				()->{ cde.payer(); }
			);

		cde.rembourser();

		// on ne peut pas livrer
		assertThrows(CdeNonLivrableEx.class, 
				() -> { cde.livrer(); }
			);
		assertThrows(CdeNonRemboursableEx.class,
				()->{ cde.rembourser(); }
			);

		cde.payer();
		assertThrows(CdeNonPayableEx.class,
				()->{ cde.payer(); }
			);

		cde.livrer();
		assertThrows(CdeNonPayableEx.class,
				()->{ cde.payer(); }
			);
		assertThrows(CdeNonRemboursableEx.class,
				()->{ cde.rembourser(); }
			);
		assertThrows(CdeNonLivrableEx.class, 
				() -> { cde.livrer(); }
			);
	}
}
