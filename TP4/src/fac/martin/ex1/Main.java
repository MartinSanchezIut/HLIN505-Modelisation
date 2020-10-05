package fac.martin.ex1;

import java.io.File;
import java.io.IOException;

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


    public @interface Todo{
            String type() ;
            int version() ;
            int dureeTache() ;

    }
}
