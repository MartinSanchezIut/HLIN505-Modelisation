package fac.martin.ex1;

public interface Playlist extends ElementAudio{

    @Main.Todo(
            type = "Test annotation",
            version = 3,
            dureeTache = 50)
    int getNbElements() ;
}
