package tpiterateur.exo1;

import java.awt.Color;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		FeuTricolor feu = new FeuTricolor(Color.red, Color.yellow, Color.green);
		
		Iterator<Color> iterator = feu.iterator();
		while ( iterator.hasNext() )
			System.out.println(iterator.next());
	}

}
