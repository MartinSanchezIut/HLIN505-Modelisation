public class StandNourriture  implements Stand{

    String desc;
    int duree  ;
    double surf;

    @Override
    public String descriptif() {
        return desc;
    }

    @Override
    public int duree() {
        return duree;
    }

    @Override
    public double surface() {
        return surf;
    }


}
