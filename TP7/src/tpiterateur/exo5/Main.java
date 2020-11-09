package tpiterateur.exo5;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        suiteFibo(5);
        System.out.println("---");
        suiteFiboPair(5);


    }

    public static void suiteFiboPair(int n) {
        Stream.generate(new MySuplier())
                .filter(val -> val%2 == 0)
                .limit(n)
                .forEach(System.out::println);
    }

    public static void suiteFibo(int n) {
        Stream.generate(new MySuplier())
                .limit(n)
                .forEach(System.out::println);
    }



    public static class MySuplier implements Supplier<Integer> {
        int i = 0;
        @Override
        public Integer get() {
            int copyOfI = i;
            i++;
            return fibo(copyOfI);
        }
        public Integer fibo(int i) {
            if (i == 0) return 0;
            if (i == 1) return 1;

            return fibo(i-1) + fibo(i-2) ;
        }
    }
}
