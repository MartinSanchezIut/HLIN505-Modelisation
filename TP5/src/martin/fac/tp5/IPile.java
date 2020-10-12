package martin.fac.tp5;

public interface IPile<A> {

    boolean estVide() ;
    void empile(A a) ;
    A depile() ;
    int nbElements() ;
    A sommet() ;         // Retourne le sommet sans le depiler

}
