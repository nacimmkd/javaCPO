package commande;

import java.util.HashMap;
import java.util.Map;

public class Produit {
	private String libelle;
	private double prix;
	private String secteur;
	private static Map<String, Double> tableauTVA = new HashMap<String, Double> ();

	static {
		tableauTVA.put("Numérique",0.1);
		tableauTVA.put("Automobile", 0.2);
		tableauTVA.put("Restauration",0.05);	
	}

	public Produit(String libelle, double prix, String secteur) {
		if (!tableauTVA.containsKey(secteur))
			throw new IllegalArgumentException("Secteur "+ secteur + " non répertorie !");
		this.libelle = libelle;
		this.prix = prix;
		this.secteur = secteur;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public String getSecteur() {
		return secteur;
	}
	
	public double getTVA() {
		return tableauTVA.get(this.secteur);
	}
}
