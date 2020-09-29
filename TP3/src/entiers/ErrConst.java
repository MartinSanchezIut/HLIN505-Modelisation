package entiers;

public class ErrConst extends ErrNat {
	
	public ErrConst(int entier) {
		super(entier);
		System.err.println("Entier négatif");
		this.printStackTrace();
	}
	
}
