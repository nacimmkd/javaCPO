package v1;

public class Pile {
	private int taille;
	private int t[];
	private int cpt;
	public Pile(int taille) {
		this.taille = taille;
		t = new int[taille];
		cpt = 0;
	}
	public void empiler(int x) {
		assert(cpt < taille);
		t[cpt++] = x;
	}
	public int depiler() {
		assert(cpt >0);
		return t[--cpt];
	}
	public int getSommet() {
		assert(cpt >0);
		return t[cpt-1];
	}
	public boolean estPleine( ) {
		return cpt == taille;
	}
	public boolean estVide() {
		return cpt ==0;
	}
}
