package distributeur;

public abstract class Etat implements IEtat{
    protected Distributeur d;
    
    public Etat(Distributeur dist) {
        d=dist;
    }
    
    public Etat inserer_carte(Carte c) {
        System.out.println("Une carte est déja insérée. Nouvelle carte refusée.");
        return this;
    }
    
    public Etat entrer_code(int code)
    {
        System.out.println("Veuillez inserer une carte avant de taper un code / ou carte d'un autre est déja presente dans le distributeur.");
        return this;
    }
    
    public Etat retirer_argent(int somme)
    {
        System.out.println("Veuillez sisair vote code avant de retirer de l'argent.");
        return this;
    }

    public Etat consulter_solde()
    {
        System.out.println("Veuillez inserer une carte ou sisair vote code avant de consulter votre solde.");
        return this;
    }

    public Etat ajouter_argent_dans_machine(int somme)
    {
        System.out.println("Ajout d'argent impossible: carte présente dans le distributeur");
        return this;
    }
    //public abstract Etat retirer_carte();
    public Etat retirer_carte()
    {
        System.out.println("Impossible de retirer la carte: pas de carte dans le distributeur");
        return this;
    }
    
    
}
