package martin.fac.tp5;

import java.util.LinkedList;

public class CPile<A> implements  IPile<A>{

    private LinkedList<A> list ;

    public CPile() {
        list = new LinkedList<>() ;
    }

    @Override
    public boolean estVide() {
        return list.isEmpty();
    }

    @Override
    public void empile(A a) {
        list.add(a) ;
    }

    @Override
    public A depile() {
        return list.remove(nbElements() - 1);
    }

    @Override
    public int nbElements() {
        return list.size();
    }

    @Override
    public A sommet() {
        return list.get(nbElements() - 1);
    }
}
