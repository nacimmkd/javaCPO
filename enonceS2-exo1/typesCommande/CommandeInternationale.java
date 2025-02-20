package typesCommande;

import java.util.HashMap;
import java.util.Map;

import commande.Commande;

public class CommandeInternationale extends Commande {
	private double montantHT;
	private static double tva = 0.1;
	private String paysLivraison;
	private static Map<String, Double> fraisLivraison = new HashMap<String, Double> ();

	static {
		fraisLivraison.put("Allemagne",10D);
		fraisLivraison.put("Angleterre", 8D);
		fraisLivraison.put("Espagne",6D);
	}

	public CommandeInternationale(int numero, double montantHT, String paysLivraison) {
		super(numero);
		assert fraisLivraison.containsKey(paysLivraison);
		this.montantHT = montantHT;
		this.paysLivraison = paysLivraison;
	}

//	@Override
//	public double getMontantTTC() {	
//		return montantHT * (1 + tva) + fraisLivraison.get(paysLivraison);
//	}

	@Override
	public double getMontantHT() {
		return montantHT;
	}
	
	// je peux pas la supprimier, elle est dans TestsCommande
	public Object getPaysLivraison() {
		return paysLivraison;
	}

	@Override
	public double getTva() {
		return tva;
	}

	@Override
	public double getFraisLivraison() {
		return fraisLivraison.get(paysLivraison);
	}
}
