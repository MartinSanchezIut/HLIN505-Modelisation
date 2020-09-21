package martin.HLIN505.ex2;

public class main {

	public static void main(String[] args) {
		
		ListeChaine lc = new ListeChaine(1) ;
		System.out.println(lc.toString());
		lc.addToHead(2);
		System.out.println(lc.toString());
		lc.addToHead(3);
		lc.addToHead(4);
		lc.addToHead(5);
		lc.addToHead(6);
		lc.addToHead(7);
		System.out.println(lc.toString());
		
		System.out.println(lc.reverse().toString());

	}
}
