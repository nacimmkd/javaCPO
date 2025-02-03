package distributeur;

public class Client {
    public static void main(String[] argv) {
        Distributeur d = new Distributeur(0);
        
        Carte c = new Carte(0505 , 5000.);
        
        
        d.inserer_carte(c);
        d.entrer_code(0202);
        d.entrer_code(0303);
        d.entrer_code(0505);
        d.inserer_carte(c);
        d.entrer_code(0303);
        d.retirer_argent(3000);
        d.consulter_solde();
        d.inserer_carte(c); 
        d.entrer_code(0505);
        d.ajouter_argent_dans_machine(5000);
        d.retirer_argent(3000);
        d.retirer_carte();
        d.inserer_carte(c);
        
       
    }
}
