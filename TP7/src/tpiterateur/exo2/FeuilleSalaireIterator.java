package tpiterateur.exo2;

import java.util.Iterator;

public class FeuilleSalaireIterator implements Iterator<Object> {
	
	private FeuilleSalaire feuille;
	private int numeroChamp;
	
	public FeuilleSalaireIterator(FeuilleSalaire feuille) {
		super();
		this.feuille = feuille;
		numeroChamp = -1;
	}
	
	@Override
	public boolean hasNext() {
		return numeroChamp+1 < 4;
	}
	
	
	@Override
	public Object next() {
		numeroChamp++;
		switch (numeroChamp) {
		case 0:
			return feuille.getEmployeur();
		case 1:
			return feuille.getMontantNet();
		case 2:
			return feuille.getNombreHeures();
		case 3:
			return feuille.getSalarie();
		default:
			throw new ArrayIndexOutOfBoundsException("Plus de champs disponible dans la feuille de salaire !");
		}
	}

}
