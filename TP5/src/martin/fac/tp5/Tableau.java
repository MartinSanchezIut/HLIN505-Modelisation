package martin.fac.tp5;

import java.util.Comparator;

public class Tableau<A extends Comparable<A>>  {
    private A tab[];


    public Tableau (A t[]){
        this.tab = t; // on fait ici une recopie "superficielle"
    }

    public void triBulles (){
        int i = tab.length -2;
        boolean ech = true;
        while (i >=0 && ech){
            ech = false;
            for (int j = 0; j <= i; j ++)
                if (tab[j].compareTo(tab[j+1]) > 0){
                    A aux = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = aux;
                    ech = true;
                }
            i--;
        }
    }

    public void affiche ()	{
        for (A a: tab) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] tab = {10,2,6,11, 7, 2, -1, 0, 9};
        Tableau<Integer> obj = new Tableau<>(tab);
        obj.triBulles();
        obj.affiche();
    }
}
