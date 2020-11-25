public class StandPotier implements  Stand{

    private double consoEau, consoElectricite;

    @Override
    public String descriptif() {
        return null;
    }

    @Override
    public int duree() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public double prixLoc() {
        return 0;
    }

    public double getConsoEau() {
        return consoEau;
    }

    public double getConsoElectricite() {
        return consoElectricite;
    }
}
