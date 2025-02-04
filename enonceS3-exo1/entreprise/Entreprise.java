package entreprise;

import java.util.ArrayList;
import java.util.List;

import Service.Service;
import Service.ServiceExistantException;
import Service.ServicesFactory;

public class Entreprise {
	private List<Service> _Services = new ArrayList<Service>();
	private ServicesFactory factory;
	
	public Entreprise (ServicesFactory f) {
		factory = f;
	}
	
	// Ajout d'un service
	public void addService(String nom, String type) throws IllegalArgumentException, ServiceExistantException {
        if (this.searchServiceByName(nom) != null)
            throw new ServiceExistantException(nom);

        Service service = factory.creerService(type, nom);
        this._Services.add(service);
    }
	
	// Recherche de services par nom (clé de gestion)
	public Service searchServiceByName(String nom) {
        for (Service service : _Services) {
            if (service.getNom().equals(nom))
                return service;
        }
        return null;
    }
}
