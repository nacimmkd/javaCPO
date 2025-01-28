package articles;

import site_de_vente.IArticle;

public class BlueRay extends DVD implements IArticle{
	
	private static double taxe = 0.30;
	
	public BlueRay(String titre, int ageMini, double prixHT) {
		super(titre, ageMini, prixHT);
	}

	@Override
	public double getPrixTTC() { return super.getPrixHT() *(1.0 + taxe); }
	
	@Override
	public String toString() { 
		return "BlueRay "+ super.getTitre() + " à partir de " + super.getAgeMini() + " ans : "+ super.getPrixTTC()+"€";
	}
}
