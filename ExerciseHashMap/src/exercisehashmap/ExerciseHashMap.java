package exercisehashmap;

import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class ExerciseHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> pays = new HashMap<>();

        pays.put("Equador", "Quito");
        pays.put("Cameroun", "Youande");
        pays.put("Canada", "Ottawa");
        pays.put("Chile", "Santiago");

        System.out.println("Cherchez la capitale de:");
        for( Map.Entry p : pays.entrySet() ){
            System.out.println("- "+ p.getKey());
        }
        

        System.out.println("votre choix: ");
        String choix = sc.nextLine();
        String capitale = pays.get(choix);
        if(capitale != null)
            System.out.println("La capitale du "+ choix + " est " + capitale);
        else
            System.out.println("Ce pays n'est pas dans nos records");
    }
}
