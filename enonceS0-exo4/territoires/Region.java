package territoires;

import java.util.ArrayList;
import java.util.List;
import population.ITerritoire;

public class Region implements ITerritoire{
	private List<ITerritoire> villes;
	private String nom;
	
	public Region(String nom) {
		this.nom = nom;
		this.villes = new ArrayList<>();
	}
	
	
	public boolean contient (Ville v) {
		return villes.contains(v);
	}
	
	public String getNom() { return nom; }
	
	public int getPop()  {
		int total = 0;
		for (ITerritoire d : villes)
			total += d.getPop();
		return total;
	}

	@Override
	public void ajouter(ITerritoire t){
		assert(! villes.contains(t));
		villes.add(t);
		
	}




}
