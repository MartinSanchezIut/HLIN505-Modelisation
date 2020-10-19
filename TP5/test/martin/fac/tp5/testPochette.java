package martin.fac.tp5;

import martin.fac.tp5.mediateque.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.fail;

public class testPochette {

    Pochette<Livre> pLivre  ;
    Pochette<GuideVoyage> pGVoyage;
    Pochette<Document> pDoc  ;
    Pochette<DocumentJeunesse> pDocJeun  ;



    @BeforeEach
    public void setUp() {
        pLivre = new Pochette<>("La digue") ;
        pGVoyage = new Pochette<>("Du Cul") ;
        pDoc = new Pochette<>("NiqueTaRace") ;
        pDocJeun = new Pochette<>("La bringue") ;
    }

    @Test
    void hamcrestAtAGlimpse1()  {
        fail("Not implemented") ;
    }
}
