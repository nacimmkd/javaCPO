package enonce;

public class DVD implements IArticle {
	private String titre;
	private int ageMini;
	private double prixHT;
	private static double taxe = 0.20;
	public DVD (String titre, int ageMini, double prixHT) {
		this.titre = titre;
		this.prixHT = prixHT;
		this.ageMini = ageMini;
	}
	@Override
	public String getTitre()  { return titre; }
	@Override
	public double getPrixHT() { return prixHT; }
	@Override
	public double getPrixTTC() { return prixHT *(1.0 + taxe); }
	public int getAgeMini() { return ageMini; }
	@Override
	public String toString() { 
		return "DVD "+ titre + " à partir de " + ageMini + " ans : "+getPrixTTC()+"€";
	}
}
