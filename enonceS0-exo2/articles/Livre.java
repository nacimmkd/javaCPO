package articles;

import java.util.Objects;

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
	public boolean pourAdultes () { return pourAdultes; }
	@Override
	public String toString() { 
		return "Livre "+ titre + (pourAdultes? " pour adultes":" pour tous")+ " : "+getPrixTTC()+"€";
	}
	
	
	// code rajouté 
	@Override
	public int hashCode() {
		return Objects.hash(titre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return Objects.equals(titre, other.titre);
	}
	
	
	
}
