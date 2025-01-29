package postes;

import entreprise.IEmploye;

public class Planton extends Employe implements IEmploye{

	public Planton(double salaire) {
		super("planton", salaire);
	}

	@Override
	public double getPaye() {
		return super.getSalaire() + (super.getHeuresSup() * super.getTarifHS() * 2);
	}



}
