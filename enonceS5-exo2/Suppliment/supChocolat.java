package Suppliment;

import java.text.NumberFormat;

import desserts.Dessert;

public class supChocolat extends Suppliment{
	
	public supChocolat(Dessert dessertAvant) {
		super(dessertAvant);
	}
	
	public String getLibelle() {
		return super.getLibelle() +" Sup chocolat";
	}
	
	public double getPrix() {
		return super.getPrix() + 0.40;
	}
		
}
