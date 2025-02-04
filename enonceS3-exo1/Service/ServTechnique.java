package Service;

public class ServTechnique extends Service {
	public ServTechnique (String nom) {
		super(nom);		
	}	
	
	@Override
	public String getType() {	
		return "Technique";
	}
}
