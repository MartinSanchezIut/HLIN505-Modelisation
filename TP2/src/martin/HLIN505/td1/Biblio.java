package martin.HLIN505.td1;

import java.util.ArrayList;

public class Biblio {

	private ArrayList<Document> listeRef = new ArrayList<>() ;
	
	public Biblio() {
		
	}
	
	public void ajoutDoc(Document d) {
		listeRef.add(d) ;
	//	System.out.println("Ajout de " + d);
	}
	
	public boolean contains(Document d) {
		return listeRef.contains(d) ;
	}
	@Override
	public String toString() {
		return "Biblio : " + listeRef ;
	}
	
}
