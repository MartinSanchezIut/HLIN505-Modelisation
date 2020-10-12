package martin.fac.tp5;

import java.util.Comparator;

public class FileAttentePrio<A extends ElementAvecPriorite> extends FileAttente<A>
        implements Comparator<A> {


    @Override
    public A sort() {
        contenu.sort(this);
        
        return super.sort();
    }

    @Override
    public int compare(A o1, A o2) {
        return o1.priorite() - o2.priorite() ;
    }
}
