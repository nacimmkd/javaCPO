package entreprise;

public interface IEmploye {
	String getPoste();
	double getSalaire();
	void ajouterHeuresSup(int hs);
	int getHeuresSup();
	double getPaye();
}
