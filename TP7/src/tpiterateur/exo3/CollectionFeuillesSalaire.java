package tpiterateur.exo3;

import java.util.ArrayList;
import java.util.List;

import tpiterateur.exo2.*;

public class CollectionFeuillesSalaire {
	
	private List<FeuilleSalaire> listeFeuilles;
	
	public CollectionFeuillesSalaire() {
		listeFeuilles = new ArrayList<>();
	}
	
	public CollectionFeuillesSalaire(List<FeuilleSalaire> list) {
		listeFeuilles = list;
	}
	
	
	
	public void print() {
		listeFeuilles.stream().forEach(System.out::println);
	}
	
	
	public void print2() {
		listeFeuilles.forEach(System.out::println);
	}
	
	
	public void tri() {
		List<FeuilleSalaire> newList = new ArrayList<>();
		
	}

}
