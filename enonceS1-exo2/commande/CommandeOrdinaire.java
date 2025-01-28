package commande;

import decorator.ICommande;

public class CommandeOrdinaire extends Commande{

	public CommandeOrdinaire(int numero , double montant) {
		super(numero, montant);
	}


}
