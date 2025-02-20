package etats;

import distributeur.Carte;
import distributeur.Distributeur;
import distributeur.Etat;
import distributeur.IEtat;

public class EtatAttenteOperation extends Etat {

	public EtatAttenteOperation(Distributeur dist) {
		super(dist);
	}	

	@Override
	public Etat retirer_argent(int somme){

		if (d.estVide()) {
			System.out.println("Le distributeur est vide");
			return new EtatMachineVide(d);
		}
		
		Carte c = d.getCarte();
		if (c.getSolde() >= somme && d.getFonds() >= somme) {
			d.subFonds(somme);
			c.retireDeCompte(somme);
			System.out.println("Demande de retrait de " + somme + "euro, Effectu�e");
			return new EtatAttenteRetrait(d);
		}else {
			System.out.println("Solde insuffisant pour le retrait");
			return this;
		}
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
		return this;
	}

	@Override
	public Etat retirer_carte(){
		System.out.println("Carte retiree, � bientot");
		d.setCarte(null);
		return new EtatPasDeCarte(d);
	}



}
