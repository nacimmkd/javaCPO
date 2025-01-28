package commande;

import decorator.ICommande;

public class Commande implements ICommande {
	private int numero;
	private double montant;

	public Commande(int numero, double montant) {
		this.numero = numero;
		this.montant = montant;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getMontant() {
		return this.montant;
	}
}
