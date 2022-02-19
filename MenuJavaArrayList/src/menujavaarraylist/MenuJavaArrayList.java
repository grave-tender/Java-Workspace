package menujavaarraylist;

import model.Etudiant;
import model.Cours;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MenuJavaArrayList {

    //Rends sc disponnible partout
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        List<Etudiant> listeEtud = new ArrayList<>();
        List<Cours> listeCours = new ArrayList<>();

        while (option != 5) {
            voirMenu();
            option = sc.nextInt();

            switch(option){
                case 1:
                    ajoutEleve(listeEtud);
                    break;
                case 2:
                    listerEleves(listeEtud);
                    break;
                case 3:
                    ajoutCours(listeCours);
                    break;
                case 4:
                    listerCours(listeCours);
                    break;
                default:
                    option = 5;
                    System.out.println("Bonne journee!\n");
            }
        }    
    }

    /**
     * Montre les menus
     */
    public static void voirMenu(){
        System.out.println("\nChoissisez l'une des options suivantes:");
        System.out.println("\t1: Ajouter un nouvel Etudiant");
        System.out.println("\t2: Lister les Etudiants");
        System.out.println("\t3: Ajouter une nouvelle Cours");
        System.out.println("\t4: Lister les Courss");
        System.out.println("\t5: Quitter");
    }

    /**
     * Ajoute un etudiant, param une Liste<Etudiant>
     * @param List<Etudiant> liste
     */
    public static void ajoutEleve(List<Etudiant> liste){
        System.out.println("Quel est le nom de l'Etudiant?");
        String nom = sc.next();
        System.out.println("Quel est le prenom de l'Etudiant?");
        String prenom = sc.next();

        liste.add(new Etudiant(nom, prenom));
        System.out.println("Eleve ajoute avec succes!");
    }

    /**
     * Liste les etudiants, param une Liste<Etudiant>
     * @param List<Etudiant> liste
     */
    public static void listerEleves(List<Etudiant> liste){
        System.out.println("\nVoici la liste des Etudiants");

        for(int i=0; i<liste.size(); i++){
            System.out.println("\t"+(i+1)+" - " + liste.get(i).getNom() +" "+ liste.get(i).getPrenom());
        }
    }

    /**
     * Ajoute un cours, param une Liste<Cours>
     * @param List<Cours> liste
     */
    public static void ajoutCours(List<Cours> liste){
        System.out.println("Quel est l'ID du Cours?");
        String coursID = sc.next();
        System.out.println("Quel est le nom du Cours?");
        String coursNom = sc.next();

        liste.add(new Cours(coursID, coursNom));
        System.out.println("Cours ajoute avec succes!");
    }

    /**
     * Liste les cours, param une Liste<Cours>
     * @param Liste<Cours> liste
     */
    public static void listerCours(List<Cours> liste){
        System.out.println("\nVoici la liste des Cours");

        for(int j=0; j<liste.size(); j++){
            System.out.println("\t"+(j+1) +" - ID: "+ liste.get(j).getCoursID() +"\tnom du cours: "+ liste.get(j).getNom());
        }
    }
}
