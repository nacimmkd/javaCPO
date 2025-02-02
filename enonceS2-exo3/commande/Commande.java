package commande;

import java.util.Date;

import Etats.CdeNonLivrableEx;
import Etats.CdeNonRemboursableEx;
import Etats.Disponible;
import Etats.IEtatCommande;

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
//		if (payee)
//		   throw new CdeNonPayableEx();
//		this.payee = true;
		etat = this.etat.payer(this);
	}
	public void livrer() throws CdeNonLivrableEx {
//		if (! this.payee || this.dateLiv != null)
//			throw new CdeNonLivrableEx();
//		this.dateLiv = new Date();
		etat = this.etat.livrer(this);
	}
	public void rembourser() throws CdeNonRemboursableEx {
//		if (! this.payee || this.dateLiv != null)
//			throw new CdeNonRemboursableEx ();
//		this.payee = false;
		etat = this.etat.rembourser(this);
	}
	
}