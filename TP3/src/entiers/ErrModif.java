package entiers;

public class ErrModif extends ErrNat {
	
	private int entier;
	
	public ErrModif(int entier) {
		super(entier);
		System.out.println("Erreur de modification. Entier inférieur à 0");
		this.printStackTrace();
	}

}
