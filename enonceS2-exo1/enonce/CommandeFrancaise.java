package enonce;

public class CommandeFrancaise extends Commande {
	private double montantHT; 	
	private static double tva = 0.2;
	private double fraisLivraison;
	
	public CommandeFrancaise(int numero, double montantHT, double fraisLivraison) {
		super(numero);
		assert fraisLivraison >= 0;
		this.montantHT = montantHT;
		this.fraisLivraison = fraisLivraison;
	}
	
	@Override
	public double getMontantTTC() {	
		return montantHT * (1 + tva) + fraisLivraison;
	}

	@Override
	public double getMontantHT() {
		return montantHT;
	}
	
	public double getFraisLivraison() {
		return fraisLivraison;
	}
}
