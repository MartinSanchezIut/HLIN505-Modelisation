package martin.HLIN505.td1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public enum Lieu {
	Perpignan,
	Turcoing,
	Test,
	Pastaga ;
	
	
	List<Creneau> listeCreneau = new ArrayList<>() ;
	
	public void addCreneau(Creneau c) {
		listeCreneau.add(c) ;
	}
	
	public boolean estDisponible(Creneau c) {
		return !listeCreneau.contains(c);
	}
	@Override
	public String toString() {
		return this.name() + " --> " + listeCreneau.toString();
	}
}
