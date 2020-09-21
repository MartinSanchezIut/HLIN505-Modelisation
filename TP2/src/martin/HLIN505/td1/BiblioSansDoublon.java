package martin.HLIN505.td1;

public class BiblioSansDoublon extends Biblio{

	public void ajoutDoc(Document d) {
		if (!contains(d)) {
			super.ajoutDoc(d);
		}
	}
	
	public void ajoutDoc(Livre l) {
		if (!contains(l)) {
			super.ajoutDoc(l);
		}
			
	} 
}
