package martin.HLIN505.td1;

public class main {

	public static void main(String[] args) {
		Livre l1 = new Livre("L1", 3) ;
		Document l2 = new Livre("L2", 4) ;
		
		Document d = new Document("d") ;
		
		Biblio  b = new Biblio() ;
		BiblioSansDoublon bsd = new BiblioSansDoublon();
		Biblio bsd2 = new BiblioSansDoublon() ;
		
		
		
	//  ajout  dans b : Biblio
		
		b.ajoutDoc(l1);
		b.ajoutDoc(l1);
		b.ajoutDoc(l2);
		b.ajoutDoc(d);;
		System.out.println(b.toString()) ;
		
		// ajout  dans  bsd : BiblioSansDoublons
		
		bsd.ajoutDoc(l1);
		bsd.ajoutDoc(l1);
		bsd.ajoutDoc(l2);
		bsd.ajoutDoc(d);
		System.out.println(bsd.toString()) ;
		
		
		// ajout  dans  bsd2 : BiblioSansDoublons
		
		bsd2.ajoutDoc(l1);
		bsd2.ajoutDoc(l1);
		bsd2.ajoutDoc(l2);
		bsd2.ajoutDoc(d);
		System.out.println(bsd2.toString()) ;
			
		
	}

}
