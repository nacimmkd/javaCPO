package etats;

import distributeur.Distributeur;
import distributeur.Etat;

public class EtatAttenteRetrait extends Etat {

	public EtatAttenteRetrait(Distributeur dist) {
		super(dist);
	}
	
	@Override
	public Etat retirer_carte(){
		System.out.println("Effectuer... Fonds de votre compte apres retrait : " + d.getFonds());
		System.out.println("N'oubliez pas votre carte, à bientot");
        return new EtatPasDeCarte(d);
    }

}
