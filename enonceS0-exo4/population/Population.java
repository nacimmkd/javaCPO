package population;


public class Population {

	public static void fusionner(ITerritoire t1, ITerritoire t2){
		try {
			if (t1.getPop() < t2.getPop())
				t2.ajouter(t1);
			else t1.ajouter(t2);
		} catch (TerritoireNonAjoutableEx e) {
			System.out.println(e.getMessage());
		}
	}

}
