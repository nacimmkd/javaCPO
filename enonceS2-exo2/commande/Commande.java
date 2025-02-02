package commande;

public abstract class Commande {
	private int numero;
	private Client client;	

	public Commande(int numero ,Client client) {
		assert client != null;
		this.numero = numero;
		this.client = client;
	}	
	
	public Client getClient() {
		return client;
	}

	public double getMontantTTC() {	
		double ttc = getMontantHT();
		ttc -= getMontantHT() * getTauxReduction();			
		return ttc + getMontantHT()* getTVA();
	}

	public abstract double getMontantHT();
	public abstract double getTauxReduction();
	public abstract double getTVA();
}
