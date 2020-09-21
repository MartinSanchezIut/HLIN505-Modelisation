package martin.HLIN505.ex2;

public class ListeChaine {

	
	private Node racine;
	
	
	public ListeChaine(int val) {
		racine = new Node(val) ;
	}
	
	
	public Node getNext() {
		return racine.next;
	}
	
	
	public int size() {
		int size = 0;
		
		Node next = racine;
		while(next != null) {
			next = next.next ;
			size++;
		}
		
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		
		sb.append("Size = " + size() + " |") ;
		
		Node next = racine;
		while(next != null) {
			sb.append(next.value + " - ") ;
			next = next.next ;
		}	
		return sb.toString();
	}
	
	public void addToHead(int nouveau) {
		Node cache = racine ;
		
		racine = new Node(nouveau) ;
		racine.next = cache;
		
		
	}
	
	
	
	
	
	
	
	
	
	public class Node{
		private int value;
		private Node next;
		
		public Node(int v) {
			value = v;
			next = null;
		}
	}
}
