package Etats;

import java.util.Date;

import commande.Commande;

public interface IEtatCommande {
	IEtatCommande payer(Commande cde);
	IEtatCommande livrer(Commande cde);
	IEtatCommande rembourser(Commande cde);
	boolean estPayee();
	Date getDateLivraison();
}
