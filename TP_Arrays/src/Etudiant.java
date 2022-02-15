public class Etudiant {
    private String nom;
    private String prenom;
    private char sexe;

    public Etudiant(String nom, String prenom, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public char getSexe() {
        return sexe;
    }
        
}