package entreprise;

import Service.Service;

public class ServAdministratif extends Service {
	public ServAdministratif(String nom) {
		super(nom);		
	}
	
	@Override
	public String getType() {		
		return "Administratif";
	}	
}
