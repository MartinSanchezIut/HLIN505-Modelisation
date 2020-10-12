package fac.martin.ex1;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Main {

    public static void main(String[] args) {

        try {
            Song song = new Song("Marie", "Johnny", 145, "Songs");
            Song song2 = new Song("Bob", "Pierro", 145, "Songs");


            SimplePlaylist p = new SimplePlaylist("test") ;
            p.addSong(song2);
            p.addSong(song);

            System.out.println(p.toString());


        } catch (IncorectFileNameException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    enum TypeTache {WRITE, SIMPLIFY, REFACTOR, TEST} ;
    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
    public @interface Todo{
            TypeTache type() ;
            int version() ;
            int dureeTache() ;

    }
}
