package Etats;

import commande.IEtatCommande;

public class Payee extends EtatCde{
	
	@Override
	public IEtatCommande livrer() {
		return new Livree();
	}
	
	@Override
	public IEtatCommande rembourser(){
		return new Remboursee();
	}
	
	@Override
	public boolean estPayee() {
		return true;
	}
	
}
