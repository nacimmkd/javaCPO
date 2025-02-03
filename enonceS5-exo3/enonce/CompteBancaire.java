package enonce;

public class CompteBancaire {
	private int numero;
	private double solde;
	private static Journalisation logs = Journalisation.getInstance();
	
	public CompteBancaire(int numero) {
		this.numero=numero;
		this.solde=0.0;
	}
	
	public void deposerArgent(double depot) {
		assert(depot > 0);
		this.solde += depot;
		logs.ajouterLog("Nouveau depot Somme : " + depot);
	}
	
	public void retirerArgent(double retrait) {
		assert(solde >= retrait);
		this.solde -= retrait;
		logs.ajouterLog("Nouveau depot Somme : " + retrait);
	}
}
