package martin.HLIN505.td1;

public class main {

	public static void main(String[] args) {
		try {
			Creneau c1 = new Creneau(JourSemaine.Lundi, 8, 5, 14, 30) ;
			System.out.println(c1.toString());
			
			Lieu.Pastaga.addCreneau(c1);
			System.out.println(Lieu.Pastaga.toString());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
