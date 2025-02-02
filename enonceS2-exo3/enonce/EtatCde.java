package enonce;

import java.util.Date;
import commande.IEtatCommande;

public class EtatCde implements IEtatCommande{
	@Override
	public IEtatCommande payer() throws CdeNonPayableEx {
		throw new CdeNonPayableEx();
	}

	@Override
	public IEtatCommande livrer() throws CdeNonLivrableEx {
		throw new CdeNonLivrableEx();
	}

	@Override
	public IEtatCommande rembourser() throws CdeNonRemboursableEx {
		throw new CdeNonRemboursableEx();
	}

	@Override
	public boolean estPayee() {
		return false;
	}

	@Override
	public Date getDateLivraison() {
		return null;
	}
}
