package martin.fac.ex2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Utils {


    public static void toString(Object o) {
        Field[] f = FabriquePerso.getAllFields(o);


    }





    public static void listeAnotation(Class<?> c) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        double duration = 0.0;
        for (Method m : c.getMethods()) {
            Annotation[] a = m.getAnnotations();
            if (a.length > 0) {
                for (Annotation annotation : a) {
                    System.out.println("Fonction " + m.getName() + "  ->  " + annotation.toString());

                    duration += 0;
                }
            }
        }
        System.out.println("Duration = " + duration);
    }

    public static void listeAnotation(Class<?> c, String type) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Class<?> typeAn = Class.forName(type) ;
        double duration = 0.0;
        for (Method m : c.getMethods()) {
            Annotation[] a = m.getAnnotations();
            if (a.length > 0) {
                for (Annotation annotation : a) {
                    if (annotation.getClass().equals(typeAn)) {
                        System.out.println("Fonction " + m.getName() + "  ->  " + annotation.toString());
                        duration += 0;
                    }
                }
            }
        }
        System.out.println("Duration = " + duration);
    }
}
