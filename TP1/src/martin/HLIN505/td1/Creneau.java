package martin.HLIN505.td1;

public class Creneau {

	private JourSemaine jour ;
	private Heure hDebut;
	private Heure hFin;	
	
	private static int ouverture = 7;
	private static int fermeture = 19;
	
	
	
	public Creneau(JourSemaine j, int hd, int md, int hf, int mf) throws Exception {
		if ((hd > fermeture) || (hd < ouverture) || (hf >fermeture) || (hf < ouverture)) {
			throw new Exception("Heure invalide") ;
		}
		
		jour = j ;
		hDebut = new Heure(hd, md) ;
		hFin = new Heure(hf, mf) ;
	}
	
	@Override
	public String toString() {
		return jour + " (" + hDebut + "->" + hFin + ")";
	}
	
	public boolean Chevauche(Creneau c) {
		if (this.jour != c.jour) return false;
		return ((this.hFin.isAfter(c.hDebut)) || (c.hFin.isAfter(this.hDebut)) ) ;
	}
	
	public boolean estInclus(Creneau c) {
		if (this.jour != c.jour) return false;
		return ( this.hDebut.isAfter(c.hDebut) && !this.hFin.isAfter(c.hFin)  );   // || c.hDebut.isAfter(this.hDebut) && !c.hFin.isAfter(this.hFin) ) ; 
	}
	
	
	
	
	
	
	public class Heure{
		private int heure;
		private int minute;
		
		// verifier erreur d'heure et arondir a 5mn
		private static final int precision = 5 ;

		public Heure(int h, int m) throws Exception {
			if (!(h > 0 && h<24) && (m>0 && m<60)) throw new Exception("Heure invalide") ;
			
			while (m%precision != 0) m++ ;
			heure = h;
			minute = m ;
		}
		@Override
		public String toString() {
			return heure + ":" + minute;
		}
		
		public boolean isAfter(Heure h) {
			if (this.heure > h.heure) return true;
			return (this.minute > h.minute) ;
			
		}
	}
}
