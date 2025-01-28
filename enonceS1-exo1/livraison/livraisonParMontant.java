package livraison;

import commande.Commande;
import commande.ILivraison;

public class livraisonParMontant implements ILivraison{
	
	private static double tauxLivraison = 0.1;

	@Override
	public double getCoutLivraison(ICommande commande) {
		return commande.getMontant() * tauxLivraison;
	}

}

