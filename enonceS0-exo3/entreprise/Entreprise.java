package entreprise;

import java.util.ArrayList;
import java.util.List;

import postes.Employe;

public class Entreprise {
	private List<IEmploye> employes;
	public Entreprise() {
		this.employes = new ArrayList<>();
	}
	public void ajouterEmploye(IEmploye e) {
		employes.add(e);
	}
	public double getMasseSalariale() {
		double ms = 0.;
		for(IEmploye e : employes) {
				ms+= e.getPaye();
		}
		return ms;
	}
}
