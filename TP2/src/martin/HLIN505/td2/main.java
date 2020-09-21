package martin.HLIN505.td2;

import java.util.ArrayList;

public class main {
	
	

	public static void main(String[] args) {
		Constante a = new Constante(5);
		Constante b = new Constante(2);
		Constante c = new Constante(3);

		ExpComp e1 = new ExpComp(a, Operateur.PLUS, b) ;
		ExpComp e2 = new ExpComp(e1, Operateur.FOIS, c) ;
		ExpComp e3 = new ExpComp(new Constante(4), Operateur.FOIS, e2) ;
		
		System.out.println(a.eval()) ;
		System.out.println(e1.eval()) ;
		System.out.println(e2.eval()) ;
		System.out.println(e3.eval()) ;
		
		
		Object e4 = new Constante(84) ;
		System.out.println(e3.equals(e4));
		ArrayList<ExpComp> l = new ArrayList<>() ;
		l.add(e3) ;
		System.out.println(l.contains(new Constante(84)));
		
		
	}

}
