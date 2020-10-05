package fac.martin.ex1;

import java.io.File;

public abstract class AbstractAudioElement implements ElementAudio{

    private File file;
    private String title;
    private String fileLocation;



    public AbstractAudioElement(String title, String fileLocation) {
        this.title = title;
        this.fileLocation = fileLocation;
        if (! (fileLocation.charAt(fileLocation.length()-1)  == File.separatorChar )) {
            fileLocation += "/" ;
        }
        file = new File(fileLocation + title) ;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getFileLocation() {
        return fileLocation;
    }

    public File getFile() {
        return file;
    }
}
