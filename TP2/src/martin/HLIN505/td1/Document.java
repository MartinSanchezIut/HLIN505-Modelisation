package martin.HLIN505.td1;

public class Document {

	private String titre ;
	public String getNom() {
		return titre;
	}
	public Document (String s) {
		super();   // Le super de object :> Mais ya rien dedans shlag
		
		titre = s;
	}
	@Override
	public String toString() {
		return "Document : " + titre ;
	}
}
