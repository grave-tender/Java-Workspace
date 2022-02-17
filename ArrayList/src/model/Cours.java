package model;

public class Cours {
    private String classID;
    private String classNom;

    public Cours(String classID, String classNom){
        this.classID = classID;
        this.classNom = classNom;
    }

    public String getClassID() {
        return classID;
    }

    public String getClassNom() {
        return classNom;
    }
}
