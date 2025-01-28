package v2;

public class Employe {
	private String poste;
	private double salaire;
	
	public Employe(String poste, double salaire) {
		this.poste = poste;
		this.salaire = salaire;
	}
	
	public String getPoste() {
		return poste;
	}
	public double getSalaire() {
		return salaire;
	}
	
	public double getPaye() {
		return salaire;
	}
}
