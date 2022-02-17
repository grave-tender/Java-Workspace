package MyJavaArrays;

import java.util.ArrayList;
import java.util.List;
import model.Etudiant;
import model.Cours;

public class ArrayListes {
    public static void main(String[] args) {
        List<Etudiant> classe = new ArrayList<Etudiant>();
        
        classe.add(new Etudiant("Leon", "Carlos", 'M'));
        classe.add(new Etudiant("Fotie", "Barthelemy", 'M'));
        classe.add(new Etudiant("Yang", "Li", 'F'));
        classe.add(new Etudiant("Serrano", "Leonel", 'M'));
        classe.add(new Etudiant("Seguin", "Maelli", 'F'));

        List<Cours> cours = new ArrayList<Cours>();

        cours.add(new Cours("201-043-RO", "Mathematiques Appliquees"));
        cours.add(new Cours("420-906-RO", "Algo"));
        cours.add(new Cours("420-925-RO", "OS"));
        cours.add(new Cours("420-935-RO", "Concepts a la programmation"));
        cours.add(new Cours("420-953-RO", "OS 2"));


        for (Etudiant e : classe) {
            System.out.println("nom: "+ e.getNom() +"\tpremon: "+ e.getPrenom() +"\tsexe: " + e.getSexe());
        }

        System.out.print("\n");

        for (Cours c : cours) {
            System.out.println("ID: "+ c.getClassID() +"\tnom: " + c.getClassNom());
        }
    }
}
