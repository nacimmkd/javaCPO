package enonce;

public class Commande implements ICommande {
	private double montant ;
	private double poids ;
	private static double tauxLivraison = 0.1;
	
	public Commande(double montant, double poids) {		
		assert montant > 0 && poids > 0;
		this.montant = montant;
		this.poids = poids;		
	}
	
	public double calculerCoutLivraison () {
		return this.montant * Commande.tauxLivraison;
	}

	public double getMontant() {
		return montant;
	}

	public double getPoids() {
		return poids;
	}
}
