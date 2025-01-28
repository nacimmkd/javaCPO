package v2;

public class Secretaire extends Employe{
	
	private int heuresSup;
	private static double tarifHS = 15.0;

	public Secretaire(String poste, double salaire , int heuresSup) {
		super(poste, salaire);
		this.heuresSup = heuresSup;	
	}
	
	public void ajouterHeuresSup(int hs) {
		heuresSup += hs;
	}
	
	public int getHeuresSup() {
		return heuresSup;
	}
	public static double getTarifHS() {
		return tarifHS;
	}
	
	public double getPaye() {
		return getSalaire() + heuresSup * tarifHS;
	}

}
