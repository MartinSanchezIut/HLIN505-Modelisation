package tpiterateur.exo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Promotion {

    private List<Etudiant> listeEtu;

    public Promotion() {
        this.listeEtu = new ArrayList<>() ;
    }
    public void add(Etudiant e) {
        listeEtu.add(e);
    }



    public int ageMinPromo() {
        Optional<Etudiant> min = listeEtu.stream()
                    .filter(e -> (e.getCand() == Candidature.eCandidat))
                    .min((o1, o2) ->
                            Integer.compare(o1.getAge(), o2.getAge()) );

        return min.get().getAge();
    }

    public long recurtePar(Candidature c) {
        long count = listeEtu.stream()
                                    .filter(e -> e.getCand() == c)
                                    .count();

        return count;
    }

    public List<Etudiant> listAgeMax(){
        List<Etudiant> list = listeEtu.stream()
                                .filter(e -> e.getAge() == ageMaxPromo())
                                .collect(Collectors.toList());

        return list;
    }


    public int ageMaxPromo() {
        Optional<Etudiant> min = listeEtu.stream()
                .max((o1, o2) ->
                        Integer.compare(o1.getAge(), o2.getAge()) );

        return min.get().getAge();
    }
}
