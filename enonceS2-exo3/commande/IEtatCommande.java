package commande;

import java.util.Date;

public interface IEtatCommande {
	IEtatCommande payer();
	IEtatCommande livrer();
	IEtatCommande rembourser();
	boolean estPayee();
	Date getDateLivraison();
}
