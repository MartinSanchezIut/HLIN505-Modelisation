package tpiterateur.exo4;

public class Etudiant {

    private String nom;
    private int age;
    private Candidature cand;


    public Etudiant(String nom, int age, Candidature cand) {
        this.nom = nom;
        this.age = age;
        this.cand = cand;
    }


    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public Candidature getCand() {
        return cand;
    }
}
