import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HalePotier<TS extends Stand> {

    private String nom = "HalePotier";

    private double surface = 0;

    private ArrayList<TS> listeStands = new ArrayList<>();

    public HalePotier() {}

    public List<TS> getListeStands(){
        return Collections.unmodifiableList(this.listeStands);
    }
    public void ajoute(TS i){
        if (! this.listeStands.contains(i)) this.listeStands.add(i);
    }

    public double consoEauMoyenne() {
        return listeStands.stream()
                .mapToDouble(StandPotier::getConsoEau)
                .average()
                .orElse(0.0);
    }

    public double prixTotalLoc(int val) {
        return listeStands.stream()
                .filter(e -> {return e.surface() >= val;})
                .mapToDouble(e->{return e.prixLoc();})
                .sum() ;
    }
}