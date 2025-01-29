package territoires;

import enonce.TerritoireNonAjoutableEx;
import population.ITerritoire;

public class Ville implements ITerritoire{
	private String nom;
	private int pop;
	
	public Ville(String nom, int pop) {
		this.nom = nom;
		this.pop = pop;
	}
	
	public int getPop()  { return pop; }
	public String getNom()  { return nom; }

	@Override
	public void ajouter(ITerritoire t) throws TerritoireNonAjoutableEx {
		throw new TerritoireNonAjoutableEx("On peut pas ajouter une ville dans une ville");
		
	}

	
	
	
	
}
