package martin.HLIN505.td2;

public enum Operateur {
	PLUS("+"),
	MOINS("-"),
	FOIS("*"),
	DIV("/");
	
	private String label ;
	
	private Operateur(String l) {
		label = l;
	}
	public String getLabel() {
		return label;
	}
}
