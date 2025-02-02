package Etats;

import commande.IEtatCommande;

public class Remboursee extends EtatCde{
	
	@Override
	public IEtatCommande payer(){
		return new Payee();
	}
}
