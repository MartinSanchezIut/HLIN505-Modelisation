package martin.fac.tp5.mediateque;

public class Main {

    public static void main(String[] args) {
        Pochette<Livre> pLivre = new Pochette<>("La digue") ;
        Pochette<GuideVoyage> pGVoyage = new Pochette<>("Du Cul") ;

        Pochette<Document> pDoc = new Pochette<>("NiqueTaRace") ;

        Pochette<DocumentJeunesse> pDocJeun = new Pochette<>("La bringue") ;


    }
}

