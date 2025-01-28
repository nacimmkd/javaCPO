package decorator;

public abstract class CommandeDecorator implements ICommande{
	private ICommande commandeDecoree;
	
	public CommandeDecorator(ICommande commandeDecoree) {
		this.commandeDecoree = commandeDecoree;
	}

	@Override
	public int getNumero() {
		return commandeDecoree.getNumero();
	}

	@Override
	public double getMontant() {
		return commandeDecoree.getMontant();
	}
	
	

}
