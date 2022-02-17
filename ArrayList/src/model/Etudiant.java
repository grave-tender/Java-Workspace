package model;

public class Etudiant {
    private String prenom;
    private String nom;
    private char sexe;

    public Etudiant(String nom, String prenom, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public char getSexe() {
        return sexe;
    }
}