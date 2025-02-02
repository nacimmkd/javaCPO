package commande;

public class CommandeInternationale extends Commande {
	private Produit produit;				// produit commande
	private static double reduction = 0.2;	// appliquee sur le montant HT de la commande
	private static double tvaUnique = 0.01;	// TVA unique a toutes les commandes envoyees a l'international
	private static double seuilReduction = 100;	// seuil minimum de montant ht d'application de la reduction
	
	public CommandeInternationale(int numero, Client client) {
		super(numero, client);
	}

	public void setProduit(Produit produit) {
		assert produit != null;
		this.produit = produit;
	}
	
	public static void setMajoration(double majoration) {
		CommandeInternationale.reduction = majoration;
	}

	
	@Override
	public double getMontantHT() {	
		if (this.produit == null) return 0;
		return this.produit.getPrix();
	}

	@Override
	public double getTauxReduction() {
		if (this.getMontantHT() > this.seuilReduction) return reduction;
		return 0;
	}

	@Override
	public double getTVA() {
		return this.tvaUnique;
	}
	
//	@Override
//	public double getMontantTTC() {
//		if (this.produit == null)
//			return 0;
//		double ttc = getMontantHT();
//		if (this.getMontantHT() > CommandeInternationale.seuilReduction)
//			ttc -= getMontantHT() * CommandeInternationale.reduction;			
//		return ttc + getMontantHT()*tvaUnique;
//	}
	
}
