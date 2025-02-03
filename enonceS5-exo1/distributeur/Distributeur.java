package distributeur;

import etats.EtatPasDeCarte;
import etats.EtatAttenteOperation;
import etats.EtatAttenteRetrait;

public class Distributeur {
    private Etat etat;     // L'état courant de la machine
    private Carte c;
    private int fonds;
    
    public Distributeur(int fond_initial) {
    	this.etat = new EtatPasDeCarte(this);
    	this.fonds = fond_initial;
    	this.c = null;
    }
    
    public void inserer_carte(Carte c) {etat=etat.inserer_carte(c); System.out.println(this);}
    public void entrer_code(int code) {etat=etat.entrer_code(code); System.out.println(this);}
    public void retirer_argent(int somme) {etat=etat.retirer_argent(somme); System.out.println(this);}
    public void consulter_solde() {etat=etat.consulter_solde(); System.out.println(this);}
    public void ajouter_argent_dans_machine(int somme) {etat=etat.ajouter_argent_dans_machine(somme); System.out.println(this);}
    public void retirer_carte() {etat=etat.retirer_carte(); System.out.println(this);}
    
    public void addFonds(int s) {fonds+=s;} //Ici, il faudrait protéger ces fonctions pour que seuls les états puissent les appeler
    public void subFonds(int s) {fonds-=s;}
    public int getFonds() {return fonds;}
    public void setCarte(Carte cb) {c=cb;}
    public Carte getCarte() {return c;}
    public Etat getState() {return etat;}
    
    @Override public String toString() {
        return ("Distributeur en mode "+etat);
    }
}
