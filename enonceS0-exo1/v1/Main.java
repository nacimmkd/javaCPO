package v1;

public class Main {
	public static void main(String[] args) {
		Pile p = new Pile(2);
		if (p.estVide())
			System.out.println("La pile est vide");
		else 
			System.out.println("La pile n'est pas vide");
		p.empiler(5);
		System.out.println("sommet : " + p.getSommet());
		p.empiler(7);
		System.out.println("sommet : " +p.getSommet());
		if (p.estPleine())
			System.out.println("La pile est pleine");
		else 
			System.out.println("La pile n'est pas pleine");
		System.out.println("Dépilé : "+ p.depiler());
		System.out.println("Dépilé : "+ p.depiler());
		if (p.estVide())
			System.out.println("La pile est vide");
		else 
			System.out.println("La pile n'est pas vide");
	}
}
