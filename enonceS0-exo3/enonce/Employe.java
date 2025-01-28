package enonce;

public class Employe {
	private String poste;
	private double salaire;
	private int heuresSup;
	private static double tarifHS = 15.0;
	public Employe(String poste, double salaire) {
		this.poste = poste;
		this.salaire = salaire;
		this.heuresSup = 0;
	}
	public void ajouterHeuresSup(int hs) {
		heuresSup += hs;
	}
	public String getPoste() {
		return poste;
	}
	public double getSalaire() {
		return salaire;
	}
	public int getHeuresSup() {
		return heuresSup;
	}
	public static double getTarifHS() {
		return tarifHS;
	}
}
