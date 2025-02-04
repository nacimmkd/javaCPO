package Banc;

//Utilisés pour la date affichée dans les logs.
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Journalisation {
	private String journal; // Chaine de caractères stockant tous les messages de log.
	private static Journalisation _instance = new Journalisation();
	
	private Journalisation() {journal = "";}
	
	
	static Journalisation getInstance() {
		return _instance;
	}
	
	
	public void ajouterLog(String message) {
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
		journal += "[" + dateFormat.format(d) + "] : " + message + "\n";
	}
	
	// Méthode qui retourne tous les messages de log.
	public String afficherLog() {
		return this.journal;
	}
}
