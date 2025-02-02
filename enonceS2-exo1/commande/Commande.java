package commande;

public abstract class Commande {
	private int numero;

	public Commande(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public final double getMontantTTC() {	
		return getMontantHT() * (1 + getTva()) + getFraisLivraison();
	}

	public abstract double getMontantHT();
	public abstract double getTva();
	public abstract double getFraisLivraison();
}
