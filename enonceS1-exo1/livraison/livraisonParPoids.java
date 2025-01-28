package livraison;

import java.awt.color.ICC_ColorSpace;

import commande.Commande;
import commande.ILivraison;

public class livraisonParPoids implements ILivraison{

	@Override
	public double getCoutLivraison(ICommande commande) {
		if (commande.getPoids() < 2) {
			return 2;
		} 
		return 9;
	}

}
