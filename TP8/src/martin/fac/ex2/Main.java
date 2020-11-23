package martin.fac.ex2;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        /*try {
            FabriquePerso.creer("PersonnageBonus");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }*/


        try {
            //System.out.println(FabriquePerso.modifierPersonnage(new PersonnageBonus()).toString());
            Utils.listeAnotation(Personnage.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
