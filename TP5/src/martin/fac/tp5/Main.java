package martin.fac.tp5;

public class Main {

    public static void main(String[] args) {
        CPile<Integer> list = new CPile<>();

        list.empile(5);
        list.empile(4);
        //System.out.println(list.nbElements());
        list.depile();
       // System.out.println(list.nbElements());


        FileAttentePrio<Personne> file = new FileAttentePrio<>() ;
        file.entre(new Personne("1", 15));
        file.entre(new Personne("2", 66));
        file.entre(new Personne("3", 44));
        file.entre(new Personne("4", 16));
        System.out.println(file);

        file.sort();
        System.out.println(file);

    }

}

