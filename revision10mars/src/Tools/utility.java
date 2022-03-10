package Tools;

import java.util.Random;

public class utility {
    public static void println(String msg){
        System.out.println(msg);
    }

    //retourne un chiffre aleatoire entre 1 et 10
    public static int randomInt(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
