package v2;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	private List<Employe> employes;
	public Entreprise() {
		this.employes = new ArrayList<>();
	}
	public void ajouterEmploye(Employe e) {
		employes.add(e);
	}
	public double getMasseSalariale() {
		double ms = 0.;
		for(Employe e : employes) {
			ms += e.getPaye();
		}
		return ms;
	}
}
