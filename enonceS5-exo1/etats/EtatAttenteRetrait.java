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
		System.out.println("Carte retir�e, � bientot");
		d.setCarte(null);
		return new EtatPasDeCarte(d);
	}
	
}
