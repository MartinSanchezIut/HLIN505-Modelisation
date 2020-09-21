package martin.HLIN505.td1;

public class Livre extends Document{

	private int nbChapitres ;
	
	public int getNbChap() {
		return nbChapitres ;
	}
	public Livre(String s, int nbChap) {
		super(s);
		nbChapitres = nbChap ;
	}
	//public Livre() {}
// Car on ne fait pas appel au constructeur de pere Document
	
}
