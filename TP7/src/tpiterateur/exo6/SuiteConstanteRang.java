package tpiterateur.exo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SuiteConstanteRang implements Iterable<Integer>{

    List<Integer> list = new ArrayList<>() ;

    public SuiteConstanteRang() {
        for (int i = 0; i < 100; i++) {
            double d = Math.log(i) ;
            list.set(i, (int) d)  ;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IterateurSuiteConstateRang(list);
    }

}
