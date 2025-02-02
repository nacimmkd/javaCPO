package Etats;

import commande.IEtatCommande;

public class Disponible extends EtatCde{
	
	@Override
	public IEtatCommande payer(){
		return new Payee();
	}
}
