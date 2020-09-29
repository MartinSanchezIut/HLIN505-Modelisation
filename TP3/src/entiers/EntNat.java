package entiers;

public class EntNat {
	
	private int n;
	
	public EntNat(int entier) throws ErrConst {
		if ( entier < 0 )
			throw new ErrConst(entier);
		this.n = entier;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) throws ErrModif {
		if ( n < 0 )
			throw new ErrModif(n);
		this.n = n;
	}
	
	public void decremente() throws ErrModif {
		this.setN(n-1);
	}
	
	public static void decremente(EntNat e) throws ErrModif {
		e.setN(e.getN()-1);
	}
}
