package model;

public class Cours {
    private String coursID;
    private String coursNom;

    public Cours(String coursID, String coursNom){
        this. coursID = coursID;
        this. coursNom = coursNom;
    }

    public String getCoursID() {
        return coursID;
    }

    public String getCoursNom() {
        return coursNom;
    }
}
