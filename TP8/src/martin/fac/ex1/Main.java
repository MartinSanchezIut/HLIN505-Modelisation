package martin.fac.ex1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        NimporteQuoi n = new NimporteQuoi();

        try {
            n.getMethod(2);
            System.out.println("---------");
            n.getSuperClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
