package site_de_vente;

public interface IArticle {
	String getTitre();
	double getPrixHT();
	double getPrixTTC();
	boolean pourAdultes();
}