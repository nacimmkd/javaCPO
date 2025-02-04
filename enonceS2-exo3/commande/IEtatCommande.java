package commande;

import java.util.Date;

import Etats.*;

public interface IEtatCommande {
	IEtatCommande payer() throws CdeNonLivrableEx;
	IEtatCommande livrer() throws CdeNonLivrableEx;
	IEtatCommande rembourser() throws CdeNonRemboursableEx;
	boolean estPayee();
	Date getDateLivraison();
}
