package etats;

import distributeur.Carte;
import distributeur.Distributeur;
import distributeur.Etat;

public class EtatMachineVide extends Etat{

	public EtatMachineVide(Distributeur dist) {
		super(dist);
	}
	
	@Override
	public Etat consulter_solde(){
		Carte c = d.getCarte();
		System.out.println("Solde de compte : " + c.getSolde());
		return this;
	}
	
	@Override
	public Etat ajouter_argent_dans_machine(int somme){
		Carte c = d.getCarte();
		c.ajouteSolde(somme);	//ajoute d'argents dans le solde de carte
		d.addFonds(somme); // mais aussi ajoute de d'argent dans la machine
		System.out.println("Ajoute de " + somme + " , Effectuée");
		return new EtatAttenteOperation(d);
	}

	@Override
	public Etat retirer_carte(){
		System.out.println("Carte retiree, à bientot");
		d.setCarte(null);
		return new EtatPasDeCarte(d);
	}


}
