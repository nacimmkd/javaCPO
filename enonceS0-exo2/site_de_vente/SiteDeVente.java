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
	// à partir de 6 ans pour les DVD <----------- il faut une méthode getAgeMini() !
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
	
	// cette méthode vise à permettre la comparaison entre articles
	// de différentes classes
	// le titre est une clé pour les livres mais pas pour les DVD
	// car plusieurs version du même films (même titre) peuvent concerner
	// des publics différents, il faut donc en plus vérifier que l'age requis
	// est le même
	public boolean memeArticle(IArticle a1, IArticle a2) {
		return a1.equals(a2);
	}
	
	public boolean contientDeja(IArticle article) {
		return articles.contains(article);
	}
}
