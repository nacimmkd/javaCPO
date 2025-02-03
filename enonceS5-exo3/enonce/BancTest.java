package enonce;

public class BancTest {

	public static void main(String[] args) {
		CompteBancaire c = new CompteBancaire(5242);
		Journalisation logs = Journalisation.getInstance();
		c.deposerArgent(2000.);
		c.deposerArgent(500.);
		c.retirerArgent(250.);
		System.out.println(logs.afficherLog());
		

	}

}
