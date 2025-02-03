package distributeur;

public class Carte {
    private int code_secret;
    private int failed_try;
    private double solde;

    public Carte(int code_pin , double solde) {
        code_secret=code_pin;
        failed_try=0;
        this.solde = solde;
    }

    public boolean is_pin_good(int essai) {
           return (essai==code_secret);
    }
    
    public void failed_code() {
        failed_try++;
    }
    
    public int getfailed_try() {
        return failed_try;
    }
    
    public double getSolde() {
    	return this.solde;
    }
    
    public void ajouteSolde(double montant) {
    	this.solde += montant;
    }
    
    public void retireDeCompte(double montant) {
    	this.solde -= montant;
    }
}
