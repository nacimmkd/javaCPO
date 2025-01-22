package articles;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		DVD d1 = new DVD("Les Misérables", 6, 9.0);
		DVD d2 = new DVD("Les Misérables", 6, 9.0);
		
		System.out.println(d1);
		System.out.println(d2);

		if (d1 == d2) System.out.println("OK");
		else System.out.println("KO");
		
		if (d1.equals(d2)) System.out.println("OK");
		else System.out.println("KO");
		
		
	}

}
