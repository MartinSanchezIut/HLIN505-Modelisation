package fac.martin.ex1;

import java.io.IOException;

public class IncorectFileNameException extends IOException {

    String file;

    public IncorectFileNameException(String file) {
        this.file = file;
        printError();
    }

    public IncorectFileNameException() {
        file = "undefined" ;
        printError();
    }

    private void printError() {
        System.err.println("Erreur : le fichier " + file + " n'existe pas.");
        this.printStackTrace();
    }

    public String getFile() {
        return file;
    }
}
