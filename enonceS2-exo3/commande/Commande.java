package commande;

import java.util.Date;

import Etats.CdeNonLivrableEx;
import Etats.CdeNonRemboursableEx;
import Etats.Disponible;

public class Commande {
	private int numero;
	private IEtatCommande etat;
	
	public Commande (int numero ) {
		this.numero = numero;
		this.etat = new Disponible();		
	}
	
	public int getNumero() {
		return numero;
	}
	public boolean estPayee () {
		return this.etat.estPayee();
	}
	public Date getDateLivraison () {
		return this.etat.getDateLivraison();
	}
	public void payer() {
		etat = this.etat.payer();
	}
	public void livrer() throws CdeNonLivrableEx {
		etat = this.etat.livrer();
	}
	public void rembourser() throws CdeNonRemboursableEx {
		etat = this.etat.rembourser();
	}
	
}