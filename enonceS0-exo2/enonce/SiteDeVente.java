package enonce;

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
			if (a instanceof Livre) {
				Livre li = (Livre) a;
				if (!li.getPourAdultes())
					pourTous.add(li);
			}
			if (a instanceof DVD) {
				DVD dvd = (DVD) a;
				if (dvd.getAgeMini() <= 6)
					pourTous.add(dvd);
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
		if (a1.getClass() != a2.getClass())
			return false;
		if (a1 instanceof Livre)
			return a1.getTitre().equals(a2.getTitre());
		assert a1 instanceof DVD; // sinon compléter cette méthode
		DVD d1 =(DVD) a1;
		DVD d2 =(DVD) a2;
		// on peut avoir deux version du meme DVD pour des publics différents
		return d1.getTitre() == d2.getTitre() && d1.getAgeMini() == d2.getAgeMini();
	}
	
	public boolean contientDeja(IArticle article) {
		for (IArticle a : articles )
			if (memeArticle(a, article))
				return true;
		return false;
	}
}
