package Suppliment;

import java.text.NumberFormat;

import desserts.Dessert;

public abstract class Suppliment extends Dessert{
	
	protected Dessert dessertAvant;
	
	public Suppliment (Dessert dessertAvant) {
		this.dessertAvant = dessertAvant;
	}
	
	public String getLibelle() {
		return dessertAvant.getLibelle();
	}
	public double getPrix() {
		return dessertAvant.getPrix();
	}

	
	public String toString() {
		NumberFormat format=NumberFormat.getInstance();
		format.setMinimumFractionDigits(2);// 2 chiffres après la virgule suffisent pour l'affichage.
		return this.getLibelle()+" : "+format.format(this.getPrix())+" euros";
	}
	
	

}
