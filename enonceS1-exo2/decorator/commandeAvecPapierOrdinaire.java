package decorator;

public class commandeAvecPapierOrdinaire extends CommandeDecorator {

	public commandeAvecPapierOrdinaire(ICommande commandeDecoree) {
		super(commandeDecoree);
		
	}

	public double getMontant() {
		return super.getMontant() + 2.;
	}
	
}
