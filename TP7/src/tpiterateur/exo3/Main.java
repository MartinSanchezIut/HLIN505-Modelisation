package tpiterateur.exo3;

import java.util.ArrayList;
import java.util.List;

import tpiterateur.exo2.FeuilleSalaire;

public class Main {

	public static void main(String[] args) {
		
		FeuilleSalaire feuille = new FeuilleSalaire("Enedis", "Robert", 15, 1500.0);
		
		FeuilleSalaire feuille2 = new FeuilleSalaire("EDF", "Julien", 15, 1500.0);
		
		FeuilleSalaire feuille3 = new FeuilleSalaire("Enedis", "Jul", 35, 2400.0);
		
		
		List<FeuilleSalaire> feuilles = new ArrayList<>();
		feuilles.add(feuille3);
		feuilles.add(feuille2);
		feuilles.add(feuille);
		
		
		CollectionFeuillesSalaire collec = new CollectionFeuillesSalaire(feuilles);
		//collec.print();
		//collec.print2();
		collec.tri();
		collec.tri2();
		collec.tri3();

		System.out.println(collec.feuillesEntreprise("enedis")) ;
		System.out.println(collec.feuillesEmploye("Ju")) ;
	}

}
