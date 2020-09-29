package entiers;

public class ErrNat extends RuntimeException {
	
	private int n;
	
	public ErrNat(int n) {
		this.n = n;
		this.printStackTrace();
	}

}
