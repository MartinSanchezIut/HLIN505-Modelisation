package tpiterateur.exo2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		FeuilleSalaire feuille = new FeuilleSalaire("Enedis", "Robert", 15, 1500.0);
		
		Iterator<Object> iterator = feuille.iterator();
		while ( iterator.hasNext() )
			System.out.println(iterator.next());
	}

}
