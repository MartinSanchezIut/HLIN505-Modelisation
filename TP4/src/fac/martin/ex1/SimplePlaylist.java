package fac.martin.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimplePlaylist extends AbstractAudioElement implements Playlist  {

    List<Song> songs;
    File format;

    public SimplePlaylist(String nom) {
        super(nom, "Songs");

        songs = new ArrayList<>() ;
        format = new File(getFileLocation() + File.separatorChar + "Playlist-" + nom + ".format") ;
        if(!format.exists()) {
            createFormat() ;
        }else {
            lectureFichier() ;
        }
    }

    public SimplePlaylist(String title, String fileLocation) throws IncorectFileNameException {
        super(title, fileLocation);

        if (!(getFile().exists())) {
            try {
                getFile().createNewFile() ;
            } catch (IOException e) {
                e.printStackTrace();
            }
            throw new IncorectFileNameException(getFile().getPath()) ;
        }

        songs = new ArrayList<>() ;
        format = new File(getFileLocation() + File.separatorChar + "format.txt") ;
        if(!format.exists()) {
            createFormat() ;
        }else{
            lectureFichier() ;
        }
    }

    private void lectureFichier()  {
        try {
            Scanner sc = new Scanner(format) ;
            while(sc.hasNext()){
                String[] s = sc.nextLine().split("&");
                if (s.length == 4) {
                    Song song = new Song(s[0], s[1], Integer.parseInt(s[2]), s[3]);
                    songs.add(song);
                }
            }
            sc.close();
        } catch (FileNotFoundException | IncorectFileNameException e) {
            e.printStackTrace();
        }
    }
    public void addSong(Song s) throws IOException {
        songs.add(s) ;
        createFormat();
       /* FileWriter w = new FileWriter(format) ;
        w.write(s.toString() + "\n");
        w.close(); */
    }
    private void createFormat() {
        try{
            format.createNewFile();
            format.delete();
            format.createNewFile();

            FileWriter w = new FileWriter(format) ;
            w.write("Nom: " + getTitle() + "\n");

            for (Song s: songs) {
                w.write(s.toFile() + "\n");
            }

            w.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public long getSize() {
        long size = 0;
        for (Song s: songs) {
            size += s.getSize();
        }
        return size;
    }

    @Override
    public int getDuration() {
        int dur = 0;
        for (Song s: songs) {
            dur += s.getDuration();
        }
        return dur;    }

    @Override
    public String getFileLocation() {
        return super.getFileLocation();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public int getNbElements() {
        return songs.size();
    }

    @Override
    public String toString() {
        return songs.toString();
    }
}
