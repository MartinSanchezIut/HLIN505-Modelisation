package tpiterateur.exo1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FeuTricolor implements Iterable<Color> {
	
	
	private List<Color> couleurs;
	
	
	public FeuTricolor(Color color1, Color color2, Color color3) {
		couleurs = new ArrayList<>();
		couleurs.add(color1);
		couleurs.add(color2);
		couleurs.add(color3);
	}
	
	
	@Override
	public Iterator<Color> iterator() {
		return new FeuTricolorIterator(couleurs);
	}

}
