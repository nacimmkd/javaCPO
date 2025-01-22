package enonce;

public class Livre implements IArticle {
	private String titre;
	private double prixHT;
	private boolean pourAdultes;
	private static double taxe = 0.05;
	public Livre (String titre, boolean pourAdultes, double prixHT) {
		this.titre = titre;
		this.prixHT = prixHT;
		this.pourAdultes = pourAdultes;
	}
	@Override
	public String getTitre()  { return titre; }
	@Override
	public double getPrixHT() { return prixHT; }
	@Override
	public double getPrixTTC() { return prixHT *(1.0 + taxe); }
	public boolean getPourAdultes () { return pourAdultes; }
	@Override
	public String toString() { 
		return "Livre "+ titre + (pourAdultes? " pour adultes":" pour tous")+ " : "+getPrixTTC()+"€";
	}
}
