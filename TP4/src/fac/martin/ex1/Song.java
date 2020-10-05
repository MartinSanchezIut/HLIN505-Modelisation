package fac.martin.ex1;

import java.io.IOException;

public class Song extends AbstractAudioElement{

    String chanteur;
    int duration ;

    public Song(String title, String chanteur, int duration, String fileLocation) throws IncorectFileNameException {
        super(title, fileLocation);

        this.chanteur = chanteur;
        this.duration = duration;

        if (!(getFile().exists())) {
            try {
                getFile().createNewFile() ;
            } catch (IOException e) {
                e.printStackTrace();
            }
           throw new IncorectFileNameException(getFile().getPath()) ;
        }
    }


    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public long getSize() {
        return getFile().length();
    }

    @Override
    public String toString() {
        return " Chanteur=" + chanteur + " Durée=" + duration + " Taille: "+getSize()
                + " File: " + getFile();
    }

    public String toFile() {
        StringBuilder sb = new StringBuilder();
//     title, chanteur, duration, fileLocation
        sb.append(getTitle() + "&") ;
        sb.append(chanteur + "&") ;
        sb.append(getDuration() + "&") ;
        sb.append(getFileLocation()) ;
        return sb.toString();
    }
}
