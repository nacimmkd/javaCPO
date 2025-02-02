package enonce;

public abstract class Commande {
	private int numero;

	public Commande(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public abstract double getMontantTTC();
	public abstract double getMontantHT();
}
