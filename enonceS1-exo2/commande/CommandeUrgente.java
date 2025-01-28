package commande;

public class CommandeUrgente extends Commande {
	private static double majoration = 0.2;

	public CommandeUrgente(int numero, double montant) {
		super(numero, montant);
	}
	
	public double getMontant() {
		return super.getMontant() * (1 + majoration);
	}
	
	public static double getMajoration() {
		return CommandeUrgente.majoration;
	}

	public static void setMajoration(double majoration) {
		CommandeUrgente.majoration = majoration;
	}
}
