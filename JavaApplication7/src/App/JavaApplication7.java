// package App;

public class JavaApplication7 {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();
        etudiant.setPrenom("Bob");
        etudiant.setNom("L'Eponge");
        System.out.println("Nom: " + etudiant.getNom() + " Prenom: " + etudiant.getPrenom());
    }
}
