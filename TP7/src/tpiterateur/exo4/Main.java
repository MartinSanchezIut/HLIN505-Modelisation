package tpiterateur.exo4;

public class Main {

    public static void main(String[] args) {
        Promotion p = new Promotion()   ;

        p.add(new Etudiant("Etu-1", 15 ,Candidature.eCandidat));
        p.add(new Etudiant("Etu-2", 114 ,Candidature.autre));
        p.add(new Etudiant("Etu-3", 18 ,Candidature.CampusFrance));
        p.add(new Etudiant("Etu-4", 22 ,Candidature.eCandidat));
        p.add(new Etudiant("Etu-5", 24 ,Candidature.eCandidat));
        p.add(new Etudiant("Etu-6", 29 ,Candidature.CampusFrance));
        p.add(new Etudiant("Etu-7", 20 ,Candidature.eCandidat));
        p.add(new Etudiant("Etu-8", 21 ,Candidature.autre));
        p.add(new Etudiant("Etu-9", 11 ,Candidature.autre));
        p.add(new Etudiant("Etu-10", 95 ,Candidature.eCandidat));

        System.out.println(p.ageMinPromo());
        System.out.println(p.recurtePar(Candidature.eCandidat));
        System.out.println(p.recurtePar(Candidature.CampusFrance));
        System.out.println(p.recurtePar(Candidature.autre));

        for (Etudiant e: p.listAgeMax()) {
            System.out.println(e.getNom() + " " + e.getAge());
        }

    }
}
