package exercisehashmap;

import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class ExerciseHashMap {
    public static void main(String[] args) {
        //initialisation
        Scanner sc = new Scanner(System.in);
        Map<String, String> pays = new HashMap<>();

        //ajout des valeurs
        pays.put("Equador", "Quito");
        pays.put("Cameroun", "Youande");
        pays.put("Canada", "Ottawa");
        pays.put("Chili", "Santiago");

        //iteration sur le hashmap
        System.out.println("Cherchez la capitale de:");
        for( Map.Entry p : pays.entrySet() ){
            System.out.println("- "+ p.getKey());
        }

        //choix
        System.out.println("votre choix: ");
        String choix = sc.nextLine();
        
        //gestion du choix
        choix = choix.substring(0, 1).toUpperCase() + choix.substring(1); //pour Yang Li
        String capitale = pays.get(choix);

        if(capitale != null)
            System.out.println("La capitale du "+ choix + " est " + capitale);
        else
            System.out.println("Ce pays n'est pas dans nos records");
    }
}
