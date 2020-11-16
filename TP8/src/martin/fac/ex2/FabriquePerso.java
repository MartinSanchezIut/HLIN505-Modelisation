package martin.fac.ex2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class FabriquePerso {

    public static Personnage creer(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        if (type.equalsIgnoreCase("PersonnageInvisible")) {

            Personnage p = (Personnage) Class.forName("martin.fac.ex2.PersonnageInvisible").getClass().getConstructors()[0].newInstance() ;
            return p;
        } else if (type.equalsIgnoreCase("PersonnageBonus")) {

            Personnage p = (Personnage) Class.forName("martin.fac.ex2.PersonnageBonus").getClass().getConstructors()[0].newInstance() ;
            return p;
        } else {
            return null;
        }
    }

    public static void modifierPersonnage(Personnage p) {
        for (Field f : p.getClass().getFields()) {
            System.out.println(f.getName() + " ("+f.getType()+") :");




        }



    }

}
