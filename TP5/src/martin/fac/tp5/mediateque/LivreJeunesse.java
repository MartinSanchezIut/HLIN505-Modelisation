package martin.fac.tp5.mediateque;

public class LivreJeunesse extends Livre implements DocumentJeunesse{

    @Override
    public int ageMinConseille() {
        return 0;
    }
}
