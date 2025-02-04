package Service;

public abstract class Service {
	private String nom = null;
	
	public Service () {		
	}
	public Service (String nom) {
		this();
		this.nom = nom;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom ;
	}
	
	public abstract String getType();
}
