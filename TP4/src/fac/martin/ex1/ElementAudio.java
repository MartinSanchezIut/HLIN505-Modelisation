package fac.martin.ex1;

public interface ElementAudio {


    /**
     *  getDuration : int
     *    - Force une element audio a avoir une durée
     * @return La durée d'un élément audio
     */
    int getDuration();

    /**
     *  getTitle : String
     *    - Force un element audio a avoir un titre
     * @return Titre d'un element audio
     */
    String getTitle() ;

    /**
     *  getFileLocation : String
     *    - Force un element audio a avoir un fichier
     * @return Le chemin vers le fichier
     */
    String getFileLocation() ;

    /**
     *  getSize : long
     *    - Force un element audio a avoir une taille
     * @return Taille du fichier
     */
    long getSize() ;


}
