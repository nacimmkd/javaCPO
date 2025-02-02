package Etats;

import java.util.Date;

public class Livree extends EtatCde{
	
	@Override
	public boolean estPayee() {
		return true;
	}

	@Override
	public Date getDateLivraison() {
		return new Date();
	}
}
