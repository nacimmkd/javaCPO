package enonce;

import java.util.Date;

public class Commande {
	private int numero;
	private Date dateLiv = null;
	private boolean payee = false;
	
	public Commande (int numero) {
		this.numero = numero;
	}	
	public boolean estPayee () {
		return this.payee;
	}
	public Date getDateLivraison () {
		return this.dateLiv;
	}
	public void payer() {
		if (payee)
		   throw new CdeNonPayableEx();
		this.payee = true;
	}
	public void livrer() throws CdeNonLivrableEx {
		if (! this.payee || this.dateLiv != null)
			throw new CdeNonLivrableEx();
		this.dateLiv = new Date();
	}
	public void rembourser() throws CdeNonRemboursableEx {
		if (! this.payee || this.dateLiv != null)
			throw new CdeNonRemboursableEx ();
		this.payee = false;
	}
	public int getNumero() {
		return numero;
	}	
}