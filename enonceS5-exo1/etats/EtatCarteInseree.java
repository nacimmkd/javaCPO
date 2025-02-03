package etats;

import distributeur.Carte;
import distributeur.Distributeur;
import distributeur.Etat;

public class EtatCarteInseree extends Etat{

	public EtatCarteInseree(Distributeur dist) {
		super(dist);
	}
	
	@Override
	public Etat entrer_code(int code){
		Carte carte = d.getCarte();	
		
		if (carte.getfailed_try() < 4) {
			if (carte.is_pin_good(code)) {
				System.out.println("Code Bon ... Faite votre operation");
				return new EtatAttenteOperation(d);
			} else {
				System.out.println("code pas bon , entrez a nouveau le code ");
				carte.failed_code();
				return this;			
			}
		}
		d.setCarte(null); // on depace 3 tenative , donc on retir la carte
		return new EtatPasDeCarte(d);
	}
	
	
	@Override
	public Etat retirer_carte(){
		System.out.println("Carte retiree, à bientot");
		d.setCarte(null);
        return new EtatPasDeCarte(d);
    }


}
