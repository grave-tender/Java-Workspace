package model;

public class Cours {
    private String coursID;
    private String nom;

    public Cours(String coursID, String nom){
        this.coursID = coursID;
        this.nom = nom;
    }

    public String getCoursID() {
        return coursID;
    }

    public String getNom() {
        return nom;
    }
}
