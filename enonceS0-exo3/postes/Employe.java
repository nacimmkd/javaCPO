package postes;

import entreprise.IEmploye;

public class Employe implements IEmploye{
	private String poste;
	private double salaire;
	private int heuresSup;
	private static double tarifHS = 15.;
	
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
	public double getTarifHS() {
		return tarifHS;
	}
	
	public double getPaye() {
		return salaire;		
	}
	
}
