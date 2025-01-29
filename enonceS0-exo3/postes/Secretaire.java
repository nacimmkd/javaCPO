package postes;

import entreprise.IEmploye;

public class Secretaire extends Employe implements IEmploye{	
	
	
	public Secretaire(double salaire) {
		super("secretaire", salaire);		
	}
	
	@Override
	public double getPaye() {
		return super.getSalaire() + (super.getHeuresSup() * super.getTarifHS());
	}

}
