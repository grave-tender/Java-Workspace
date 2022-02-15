public class TP_Arrays {
    public static void main(String[] args) {
        Etudiant classe[] = {
            new Etudiant("Leon", "Carlos", 'M') ,
            new Etudiant("Fotie", "Barthelemy", 'M'),
            new Etudiant("Yang", "Li", 'F'),
            new Etudiant("Serrano", "Leonel", 'M'),
            new Etudiant("Seguin", "Maelli", 'F')
        };

        Cours cours[] = {
            new Cours("201-043-RO", "Mathematiques Appliquees"),
            new Cours("420-906-RO", "Algo"),
            new Cours("420-925-RO", "OS"),
            new Cours("420-935-RO", "Concepts a la programmation"),
            new Cours("420-953-RO", "OS 2")
        };

        System.out.println("Liste d'Etudiants:");
        for ( Etudiant e : classe){
            System.out.println("nom: "+ e.getNom() +"\tpremon: "+ e.getPrenom() +"\tsexe: " + e.getSexe());
        }

        System.out.println("\nListe des cours:");
        for ( Cours c : cours){
            System.out.println("ID: "+ c.getIDCours() +"\tnom: " + c.getNomCours());
        }
    }
}
