package Service;

@SuppressWarnings("serial")
public class ServiceExistantException extends Exception {
	public ServiceExistantException(String nom) {
		super(nom);	
	}
}
