package enonce;

public class CommandeInternationale extends Commande {
	private Produit produit;				// produit commande
	private Client client;
	private static double reduction = 0.2;	// appliquee sur le montant HT de la commande
	private static double tvaUnique = 0.01;	// TVA unique a toutes les commandes envoyees a l'international
	private static double seuilReduction = 100;	// seuil minimum de montant ht d'application de la reduction
	
	public CommandeInternationale(int numero, Client client) {
		super(numero);
		assert client != null;
		this.client = client;
	}

	public void setProduit(Produit produit) {
		assert produit != null;
		this.produit = produit;
	}
	
	public static void setMajoration(double majoration) {
		CommandeInternationale.reduction = majoration;
	}

	public double getMontantHT() {	
		return this.produit.getPrix();
	}
	
	@Override
	public double getMontantTTC() {
		if (this.produit == null)
			return 0;
		double ttc = getMontantHT();
		if (this.getMontantHT() > CommandeInternationale.seuilReduction)
			ttc -= getMontantHT() * CommandeInternationale.reduction;			
		return ttc + getMontantHT()*tvaUnique;
	}
}
