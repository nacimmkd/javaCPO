package enonce;

public abstract class Commande {
	private int numero;

	public Commande(int numero) {
		this.numero = numero;
	}

	public abstract double getMontantTTC();
}
