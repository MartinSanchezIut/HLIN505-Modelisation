package martin.fac.ex1;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class NimporteQuoi {

    private ArrayList<Object> list;

    public NimporteQuoi() {
        list = new ArrayList<>() ;

        list.add("Test") ;
        list.add(4) ;
        list.add(23.5) ;
    }

    public void getSuperClass() {
        ArrayList<ArrayList<Class>> tab = new ArrayList<>() ;

        for (int i = 0; i < list.size(); i++) {
            ArrayList<Class> test = new ArrayList<>() ;
            Class cla = list.get(i).getClass();
            while (cla != null) {
                test.add(cla) ;
                cla = cla.getSuperclass();
            }
            tab.add(i, test) ;
        }

        for (ArrayList<Class> a: tab) {
            System.out.println(a);
        }

        Class lastComon = null;

        for (Class c: tab.get(0)) {
            boolean test = true;

            for (int i = 0; i < tab.size(); i++) {
                if (! tab.get(i).contains(c)) {
                    test = false ;
                }
            }
            if (test) {
                lastComon = c;
                break;
            }

        }

        System.out.println(lastComon);
    }

    public void getMethod(int i) throws ClassNotFoundException {
        System.out.println(list.get(i).getClass());
        Method[] m = list.get(i).getClass().getMethods();

        for (Method me: m) {
            System.out.println(me.toString());
        }
    }


}
