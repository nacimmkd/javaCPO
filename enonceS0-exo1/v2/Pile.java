package v2;

import java.util.LinkedList;

public class Pile {
	private int taille;
	private LinkedList<Integer> t;
	//private int cpt;
	public Pile(int taille) {
		this.taille = taille;
		t = new LinkedList<Integer>();
		//cpt = 0;
	}
	public void empiler(int x) {
		assert(t.size() < taille);
		t.addFirst(x);
	}
	public int depiler() {
		assert(t.size() >0);
		return t.removeFirst();
	}
	public int getSommet() {
		assert(t.size() >0);
		return t.getFirst();
	}
	public boolean estPleine( ) {
		return t.size() == taille;
	}
	public boolean estVide() {
		return t.isEmpty();
	}
}
