package martin.fac.ex2;

public abstract class Personnage {

	private String nom;
	private int nbPoints;
	private int nbVies;
	
	public Personnage() {
		this.nom="Perso";
		this.nbPoints=0;
		this.nbVies=1;
	}

	public Personnage(String nom, int nbPoints, int nbVies) {
		this.nom = nom;
		this.nbPoints = nbPoints;
		this.nbVies = nbVies;
	}

	public String getNom() {
		return nom;
	}

	@Todo(kind = Todo.TaskKind.WRITE, version="1.1.0", duration=2)
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	@Todo(kind = Todo.TaskKind.WRITE, version="1.1.0", duration=2)
	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public int getNbVies() {
		return nbVies;
	}

	@Todo(kind = Todo.TaskKind.WRITE, version="1.1.0", duration=2)
	public void setNbVies(int nbVies) {
		this.nbVies = nbVies;
	}


	@Override
	public String toString() {
		return "Personnage{" +
				"nom='" + nom + '\'' +
				", nbPoints=" + nbPoints +
				", nbVies=" + nbVies +
				'}';
	}
}
