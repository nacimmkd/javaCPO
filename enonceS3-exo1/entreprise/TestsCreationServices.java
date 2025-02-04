package entreprise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import Service.Service;
import Service.ServiceExistantException;
import Service.ServicesFactory;

public class TestsCreationServices {

	private Entreprise e = new Entreprise(new ServicesFactory());
	
	@Test
	public void testCreationServiceAdministratif() throws IllegalArgumentException, ServiceExistantException {
		String nomS = "Recrutement";
		String typeS = "Administratif";
		e.addService(nomS, typeS);
		Service s = e.searchServiceByName(nomS);
		assertNotNull(s);
		assertEquals(nomS, s.getNom());
		assertEquals(typeS, s.getType());
	}
	
	@Test
	public void testCreationServiceTechnique() throws IllegalArgumentException, ServiceExistantException {
		String nomS = "Realisation";
		String typeS = "Technique";
		e.addService(nomS, typeS);
		Service s = e.searchServiceByName(nomS);
		assertNotNull(s);
		assertEquals(nomS, s.getNom());
		assertEquals(typeS, s.getType());		
	}
	
	@Test (expected=ServiceExistantException.class)
	public void testCreationServiceTechniqueExistant() throws IllegalArgumentException, ServiceExistantException {
		String nomS = "Realisation";
		String typeS = "Technique";
		e.addService(nomS, typeS);
		e.addService(nomS, typeS);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testCreationServiceTypeInconnu() throws IllegalArgumentException, ServiceExistantException {
		String nomS = "Realisation";
		String typeS = "???????";
		e.addService(nomS, typeS);		
	}

}
