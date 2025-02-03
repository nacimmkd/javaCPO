package etats;

import distributeur.Distributeur;
import distributeur.Etat;

public class EtatAttenteOperation extends Etat {

	public EtatAttenteOperation(Distributeur dist) {
		super(dist);
	}	
	
	@Override
	public Etat retirer_argent(int somme){
		if (d.getFonds() > somme) {
			d.subFonds(somme);
			System.out.println("Effectuer , Fond apres retrait est " + d.getFonds());
			return new EtatAttenteRetrait(d);
		}else {
			System.err.println("Solde insuffissant pour le retrait");
			return this;
		}
    }
	
	@Override
	public Etat retirer_carte(){
		System.out.println("Carte retiree, à bientot");
		d.setCarte(null);
        return new EtatPasDeCarte(d);
    }

}
