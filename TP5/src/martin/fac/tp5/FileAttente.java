package martin.fac.tp5;

import java.util.ArrayList;
import java.util.Comparator;

public class FileAttente<A> {
	protected ArrayList<A> contenu;
	public FileAttente(){
		contenu=new ArrayList<A>();
	}

	public void entre(A p){
		contenu.add(p);
	}

	public A sort()	{
		A p=null;
		if (!contenu.isEmpty()){
			p=contenu.get(0);
			contenu.remove(0);
		}
		return p;
	}

	public boolean estVide(){
		return contenu.isEmpty();
	}
	public String toString(){
		return ""+contenu;
	}
}
