package model;

/**
 * Class des Cours
 */
public class Cours {
    private String coursID;
    private String coursNom;

    /**
     * Constructeur des intances Cours
     * @param String coursID
     * @param String coursNom
     */
    public Cours(String coursID, String coursNom){
        this. coursID = coursID;
        this. coursNom = coursNom;
    }

    /**
     * getter de l'Id d'une instance de Cours
     * @return String coursID;
     */
    public String getCoursID() {
        return coursID;
    }
    
    /**
     * getter du nom d'une instance de Cours
     * @return String coursNom
     */
    public String getCoursNom() {
        return coursNom;
    }
}
