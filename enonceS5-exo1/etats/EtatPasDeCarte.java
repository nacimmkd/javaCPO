package etats;

import distributeur.Carte;
import distributeur.Distributeur;
import distributeur.Etat;

public class EtatPasDeCarte extends Etat {

	public EtatPasDeCarte(Distributeur dist) {
		super(dist);
	}
	
	@Override
	public Etat inserer_carte(Carte c) {  
		System.out.println("Carte inseree");
		d.setCarte(c);
		return new EtatCarteInseree(d);
    }
	
		
		
	
}
