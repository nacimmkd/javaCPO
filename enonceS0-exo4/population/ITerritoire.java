package population;



public interface ITerritoire {
	String getNom();
	int getPop(); 
	void ajouter(ITerritoire t) throws TerritoireNonAjoutableEx;
}
