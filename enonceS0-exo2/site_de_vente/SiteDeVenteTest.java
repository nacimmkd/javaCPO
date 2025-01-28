package site_de_vente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import articles.DVD;
import articles.Livre;

class SiteDeVenteTest {
	private static IArticle cendrillon1 = new DVD("Cendrillon", 6, 10.0);
	private static IArticle cendrillon2 = new DVD("Cendrillon", 6, 10.0);
	private static IArticle misérablesLivre = new Livre("Les Misérables", false, 8.0);
	private static IArticle misérablesDVD6 = new DVD("Les Misérables", 6, 9.0);
	private static IArticle misérablesDVD12 = new DVD("Les Misérables", 12, 14.0);

	@Test
	void test() {
		assertFalse(misérablesLivre.equals(new DVD("Les Misérables", 0, 8.0)));
		
		SiteDeVente site = new SiteDeVente();
		assertTrue(site.ajouterArticle(cendrillon1));
		assertFalse(site.ajouterArticle(cendrillon2)); // faux car déjà ajouté
		assertTrue(site.ajouterArticle(misérablesLivre));
		assertTrue(site.ajouterArticle(misérablesDVD6));
		assertTrue(site.ajouterArticle(misérablesDVD12));
		
		List<IArticle> pourTous = site.getPourTous();
		assertEquals(pourTous.size(), 3);
		assertTrue(pourTous.contains(cendrillon2)); // doit marcher même si la référence est différente
		assertTrue(pourTous.contains(misérablesLivre));
		assertTrue(pourTous.contains(misérablesDVD6));
	}
}
 