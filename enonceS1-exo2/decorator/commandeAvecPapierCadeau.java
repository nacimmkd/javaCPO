package decorator;

public class commandeAvecPapierCadeau extends CommandeDecorator{

	public commandeAvecPapierCadeau(ICommande commandeDecoree) {
		super(commandeDecoree);
		
	}
	
	public double getMontant() {
		return super.getMontant() + 6.;
	}
	

}
