package distributeur;

public interface IEtat {
	IEtat inserer_carte(Carte c);
	IEtat entrer_code(int code);
	IEtat retirer_argent(int somme);
	IEtat retirer_carte();
	IEtat consulter_solde();
	IEtat ajouter_argent_dans_machine(int somme);
}
