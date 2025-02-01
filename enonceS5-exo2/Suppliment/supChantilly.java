package Suppliment;

import java.text.NumberFormat;

import desserts.Dessert;

public class supChantilly extends Suppliment{
	
	public supChantilly(Dessert dessertAvant) {
		super(dessertAvant);
	}
	
	public String getLibelle () {
		return super.getLibelle() + " Sup chantilly"; 
	}
	
	public double getPrix() {
		return super.getPrix() + 0.60;
	}

}
