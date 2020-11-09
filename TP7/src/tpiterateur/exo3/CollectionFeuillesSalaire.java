package tpiterateur.exo3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
		for (FeuilleSalaire f: listeFeuilles) {
			System.out.println(f);
		}
	}
	
	public void tri() {
		listeFeuilles.sort(new Comparator<FeuilleSalaire>() {
			@Override
			public int compare(FeuilleSalaire o1, FeuilleSalaire o2) {
				return o1.getNombreHeures() - o2.getNombreHeures();
			}
		});
	}

	public void tri2() {
		// newList.get(0).getNombreHeures() > coissant;
		listeFeuilles.sort((o1, o2) -> {
			return o1.getNombreHeures() - o2.getNombreHeures();
		});
	}

	public void tri3() {
		List<FeuilleSalaire> trie =
				listeFeuilles.stream()
				.sorted((o1, o2) -> {
					return o1.getNombreHeures() - o2.getNombreHeures();
				})
				.collect(Collectors.toList());
	}

	public List<FeuilleSalaire> feuillesEntreprise(String e) {
		List<FeuilleSalaire> list = listeFeuilles.stream()
										.filter(f -> f.getEmployeur().equalsIgnoreCase(e))
										.collect(Collectors.toList()) ;
		return list;
	}

	public List<FeuilleSalaire> feuillesEmploye(String e) {
		List<FeuilleSalaire> list = listeFeuilles.stream()
				.filter(f -> f.getSalarie().contains(e))
				.collect(Collectors.toList()) ;
		return list;
	}

	public List<String> getEntreprisesTest(String e) {
		List<String> list = listeFeuilles.stream()
				.filter(f -> f.getSalarie().contains(e))
				.map(f -> f.getEmployeur())
				.collect(Collectors.toList()) ;
		return list;
	}

}
