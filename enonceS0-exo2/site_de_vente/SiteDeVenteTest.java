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
	private static IArticle mis�rablesLivre = new Livre("Les Mis�rables", false, 8.0);
	private static IArticle mis�rablesDVD6 = new DVD("Les Mis�rables", 6, 9.0);
	private static IArticle mis�rablesDVD12 = new DVD("Les Mis�rables", 12, 14.0);

	@Test
	void test() {
		assertFalse(mis�rablesLivre.equals(new DVD("Les Mis�rables", 0, 8.0)));
		
		SiteDeVente site = new SiteDeVente();
		assertTrue(site.ajouterArticle(cendrillon1));
		assertFalse(site.ajouterArticle(cendrillon2)); // faux car d�j� ajout�
		assertTrue(site.ajouterArticle(mis�rablesLivre));
		assertTrue(site.ajouterArticle(mis�rablesDVD6));
		assertTrue(site.ajouterArticle(mis�rablesDVD12));
		
		List<IArticle> pourTous = site.getPourTous();
		assertEquals(pourTous.size(), 3);
		assertTrue(pourTous.contains(cendrillon2)); // doit marcher m�me si la r�f�rence est diff�rente
		assertTrue(pourTous.contains(mis�rablesLivre));
		assertTrue(pourTous.contains(mis�rablesDVD6));
	}
}
 