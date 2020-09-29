package entiers;

public class Main {

	public static void main(String[] args) {
		EntNat d = new EntNat(-1);
		try {
			EntNat a = new EntNat(1) ;
			EntNat b = new EntNat(0) ;
			EntNat.decremente(a);
			b.decremente();
			
			
		} catch (ErrConst | ErrModif e) {
			e.printStackTrace();
		}
		
		d.decremente();
	}

}
