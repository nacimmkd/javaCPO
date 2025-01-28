package territoires;

import java.util.ArrayList;
import java.util.List;

import population.ITerritoire;

public class Region implements ITerritoire{
	private List<Ville> villes;
	private String nom;
	
	public Region(String nom) {
		this.nom = nom;
		this.villes = new ArrayList<>();
	}
	
	public void ajouter(Ville v) { 
		assert(! contient(v));
		villes.add(v);
	}
	
	public boolean contient (Ville v) {
		return villes.contains(v);
	}
	
	public String getNom() { return nom; }
	
	public int getPop()  {
		int total = 0;
		for (Ville d : villes)
			total += d.getPop();
		return total;
	}
}
