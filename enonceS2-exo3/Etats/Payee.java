package Etats;

import commande.Commande;

public class Payee extends EtatCde{
	
	@Override
	public IEtatCommande livrer(Commande cde) {
		return new Livree();
	}
	
	@Override
	public IEtatCommande rembourser(Commande cde){
		return new Remboursee();
	}
	
	@Override
	public boolean estPayee() {
		return true;
	}
	
}
