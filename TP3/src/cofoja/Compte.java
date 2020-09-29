package cofoja;


import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

@Invariant({"decouvert >= 0" })

public class Compte {

    private int solde;
    private int decouvert;

    @Requires("solde >= 0")
    public Compte(int solde, int decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }
    @Requires("somme > 0")
    public void crediter(int somme) {
        solde += somme;
    }
    @Requires("somme > 0")
    @Ensures({ "solde > -decouvert" })
    public void debiter(int somme){
        solde -= somme;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde + '}';
    }
}
