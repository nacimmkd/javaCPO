package territoires;

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
}
