package martin.HLIN505.td1;

import java.util.GregorianCalendar;

public class Adherent {

	private static int nbAdhCree = 0 ;
	
	private String nom;
	private String num;
	private boolean cotisationpaye;
	private int derniereAnneCotise;
	
	public Adherent(String nom) {
		nbAdhCree++;
		
		this.nom = nom;
		this.num = nbAdhCree +"" ;
		
		cotisationpaye = true;
		derniereAnneCotise = new GregorianCalendar().get(GregorianCalendar.YEAR);
		
		
	}
}
