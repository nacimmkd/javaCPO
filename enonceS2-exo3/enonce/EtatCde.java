package enonce;

import java.util.Date;

import commande.Commande;
import Etats.IEtatCommande;

public class EtatCde implements IEtatCommande{
	@Override
	public IEtatCommande payer(Commande cde) throws CdeNonPayableEx {
		throw new CdeNonPayableEx();
	}

	@Override
	public IEtatCommande livrer(Commande cde) throws CdeNonLivrableEx {
		throw new CdeNonLivrableEx();
	}

	@Override
	public IEtatCommande rembourser(Commande cde) throws CdeNonRemboursableEx {
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
