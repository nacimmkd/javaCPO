package etats;

import distributeur.Distributeur;
import distributeur.Etat;
import distributeur.IEtat;

public class EtatAttenteRetrait extends Etat {

	public EtatAttenteRetrait(Distributeur dist) {
		super(dist);
	}
	
	@Override
	public Etat retirer_carte(){
		System.out.println("Carte retirée, à bientot");
		d.setCarte(null);
		return new EtatPasDeCarte(d);
	}
	
}
