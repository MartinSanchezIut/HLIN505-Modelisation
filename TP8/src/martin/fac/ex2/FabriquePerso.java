package martin.fac.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FabriquePerso {

    public static Personnage creer(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        if (type.equalsIgnoreCase("PersonnageInvisible")) {

            Personnage p = (Personnage) Class.forName("martin.fac.ex2.PersonnageInvisible").newInstance() ;
            return p;
        } else if (type.equalsIgnoreCase("PersonnageBonus")) {

            Personnage p = (Personnage) Class.forName("martin.fac.ex2.PersonnageBonus").newInstance() ;
            return p;
        } else {
            return null;
        }
    }

    public static Personnage migrer(Personnage p, String toClass) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Personnage perso = FabriquePerso.creer(toClass);

        Field[] from = getAllFields(p) ;
        assert perso != null;
        Field[] to = getAllFields(perso) ;

        List<Field> contains = Arrays.asList(from) ;
        for (Field f : to) {
            for (Field f1: from) {
                if (f.equals(f1))
                    f.set(perso, f1.getName());

            }
        }

        return perso;
    }

    public static Personnage modifierPersonnage(Personnage perso) throws Exception {
        Class<?> c = Class.forName(perso.getClass().getName());
        Scanner input = new Scanner(System.in) ;
        String fieldsValue;

        for (Field f : getAllFields(perso)){

            System.out.println("Entrer la valeur du champ : " + f.getType().getTypeName()+ " " + f.getName());
            fieldsValue = input.nextLine();
            f.setAccessible(true);
            switch (f.getType().getTypeName()) {
                case "Boolean" -> {
                    boolean bool = Boolean.parseBoolean(fieldsValue);
                    f.setBoolean(perso, bool);
                }
                case "int" -> {
                    int int1 = Integer.parseInt(fieldsValue);
                    f.setInt(perso, int1);
                }
                case "double" -> {
                    double doubl = Double.parseDouble(fieldsValue);
                    f.setDouble(perso, doubl);
                }
                default -> {
                    f.set(perso, fieldsValue);
                    System.out.println("defauklt");
                }
            }
            f.setAccessible(false);
        }
        return perso;
    }


    public static Field[] getAllFields(Object o) {
        ArrayList<Class<?>> sc = new ArrayList<>();
        Class<?> c = o.getClass();
        while ( c != null ) {
            sc.add(c);
            c = c.getSuperclass();
        }
        ArrayList<Field> fda = new ArrayList<>();
        for ( Class<?> cc : sc ) {
            Field[] fdt = cc.getDeclaredFields();
            for ( int i = 0 ; i < fdt.length ; i++ ) {
                fda.add(fdt[i]);
            }
        }

        Field[] result = new Field[fda.size()];
        for ( int i = 0 ; i < result.length ; i++ ) {
            result[i] = fda.get(i);
        }
        return result;
    }

}
