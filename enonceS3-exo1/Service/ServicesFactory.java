package Service;

import entreprise.ServAdministratif;

public class ServicesFactory {
	
	public Service creerService (String type, String nom) throws IllegalArgumentException, ServiceExistantException {
		Service service = null;
		if (type.equals("Administratif")) 
			service = new ServAdministratif(nom);
		else if (type.equals("Technique"))
			service = new ServTechnique(nom);
		else
			throw new IllegalArgumentException ("type");
//		if (this.searchServiceByName(nom) != null)
//			throw new ServiceExistantException (nom);
		
		return service;		
	}
	
}
