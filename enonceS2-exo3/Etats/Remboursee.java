package Etats;

import java.util.Date;

import commande.Commande;

public class Remboursee extends EtatCde{
	@Override
	public IEtatCommande payer(Commande cde){
		return new Payee();
	}
}
