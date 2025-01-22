package articles;

import java.util.Objects;

import site_de_vente.IArticle;

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
	public boolean getPourAdultes() {return ageMini > 6;}
	
	@Override
	public String toString() { 
		return "DVD "+ titre + " à partir de " + ageMini + " ans : "+getPrixTTC()+"€";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ageMini, titre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	
		DVD other = (DVD) obj;
		return ageMini == other.ageMini && Objects.equals(titre, other.titre);
	}
	
	
	
	
	
	
	
	
}
