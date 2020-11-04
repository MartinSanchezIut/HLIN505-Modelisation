package tpiterateur.exo1;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;

public class FeuTricolorIterator implements Iterator<Color>{
	
	private List<Color> couleurs;
	private int actualIndex = -1;
	
	
	public FeuTricolorIterator(List<Color> couleurs) {
		if ( couleurs != null && !couleurs.isEmpty() ) {
			this.couleurs = couleurs;
		} else {
			throw new RuntimeException("La liste de couleurs ne peut �tre vide !");
		}
		
	}
	
	
	@Override
	public boolean hasNext() {
		return actualIndex+1 < couleurs.size();
	}
	
	@Override
	public Color next() {
		actualIndex++;
		return couleurs.get(actualIndex);
	}
	
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("On ne peut retirer un �l�ment de la liste !");
	}
}
