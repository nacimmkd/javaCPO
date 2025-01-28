package commande;

import livraison.ICommande;

public class Commande implements ICommande {
	private double montant ;
	private double poids ;
	private ILivraison livraison; // creation attribut pour bridge
	
	public Commande(double montant, double poids, ILivraison livraison) {		
		assert montant > 0 && poids > 0;
		this.montant = montant;
		this.poids = poids;		
		this.livraison = livraison; // initialise attribut de bridge
	}
	
	
	@Override
	public double calculerCoutLivraison () {
		return livraison.getCoutLivraison(this);
	}

	public double getMontant() {
		return montant;
	}

	public double getPoids() {
		return poids;
	}


	
}
