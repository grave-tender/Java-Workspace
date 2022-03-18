package examenalgofinal;

import java.util.Random;

public class Utilities {
    //imprime un message qui montre clairement a quel exercise on est rendu
    public static void debutDeExercise(int exercise){
        println("\n\n============ Exercise: "+ exercise +" ============\n");
    }

    //une simplification du long System.out.println();
    public static void println(String msg){
        System.out.println(msg);
    }

    //retourne un chiffre aleatoire entre 1 et 10
    public static int randomInt(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
