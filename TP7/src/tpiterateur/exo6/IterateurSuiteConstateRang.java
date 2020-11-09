package tpiterateur.exo6;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterateurSuiteConstateRang implements Iterator<Integer> {

    private int index = 0;
    private List<Integer> list;

    public IterateurSuiteConstateRang(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void remove() {
        list.remove(index) ;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        index = (index+1) % list.size() ;
        return list.get(index);
    }
}
