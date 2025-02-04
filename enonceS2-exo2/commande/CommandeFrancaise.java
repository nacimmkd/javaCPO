package commande;

import java.util.ArrayList;
import java.util.List;

public class CommandeFrancaise extends Commande {
	private List<Produit> produits = new ArrayList<>(); // produits commandes du secteur d'activite de la commande 	
	private static double reduction = 0.1;				// taux unique applique sur le montant HT des commandes de clients fidele
	
	public CommandeFrancaise(int numero, Client client) {
		super(numero,client);			
	}
	
	public void ajouterProduit(Produit p) {
		if (!this.produits.isEmpty() && !this.produits.get(0).getSecteur().equals(p.getSecteur()))
			throw new IllegalArgumentException("Produit incompatible avec la commande");
		this.produits.add(p);
	}

	public double getMontantHT() {
		if (this.produits.isEmpty()) return 0;
		
		double montant = 0;
		for(Produit p : this.produits)
			montant += p.getPrix();
		return montant;
	}

	@Override
	public double getTauxReduction() {
		if (getClient().isClientFidele()) return reduction;
		else return 0;
	}

	@Override
	public double getTVA() {
		return produits.get(0).getTVA();
	}
	
//	@Override
//	public double getMontantTTC() {	
//		if (this.produits.isEmpty())
//			return 0;
//		double ttc = getMontantHT();
//		if (this.client.isClientFidele())
//			ttc -= getMontantHT() * CommandeFrancaise.reduction;			
//		return ttc + getMontantHT()* this.produits.get(0).getTVA();
//	}
	
	
}
