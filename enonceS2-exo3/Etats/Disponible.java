package Etats;

import commande.Commande;

public class Disponible extends EtatCde{
	
	@Override
	public IEtatCommande payer(Commande cde){
		return new Payee();
	}
}
