public interface Stand {

    String descriptif();

    int duree();

    double surface();

    double prixLocBaseHM2 = 10;

    default double prixLoc(){
        double pl = this.surface()*this.duree()*Stand.prixLocBaseHM2;
        assert pl > 0 ;
        return pl;
    }

}
