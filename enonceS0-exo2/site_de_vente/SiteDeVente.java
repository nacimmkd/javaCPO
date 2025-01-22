package site_de_vente;

import java.util.ArrayList;
import java.util.List;

public class SiteDeVente {
	private ArrayList<IArticle> articles = new ArrayList<>();
	
	public boolean ajouterArticle(IArticle a) {
		if (contientDeja(a))
			return false;
		articles.add(a);
		return true;
	}
	
	// retourne les articles pour tous :
	// � partir de 6 ans pour les DVD <----------- il faut une m�thode getAgeMini() !
	// les livres qui ne sont pas pour adultes
	public List<IArticle> getPourTous() {
		List<IArticle> pourTous = new ArrayList<>();
		
		for (IArticle a : articles) {
			if (!a.getPourAdultes()) {
				pourTous.add(a);
			}
		}
		return pourTous;
	}
	
	// cette m�thode vise � permettre la comparaison entre articles
	// de diff�rentes classes
	// le titre est une cl� pour les livres mais pas pour les DVD
	// car plusieurs version du m�me films (m�me titre) peuvent concerner
	// des publics diff�rents, il faut donc en plus v�rifier que l'age requis
	// est le m�me
	public boolean memeArticle(IArticle a1, IArticle a2) {
		return a1.equals(a2);
	}
	
	public boolean contientDeja(IArticle article) {
		return articles.contains(article);
	}
}
