package pkg10mars;

import Tools.utility;

public class question2 extends utility {
    private static int somme;
    public static void sommeDesValeurs(){
        calcul();

        println("\nLa somme des valeurs de 1 a 10 est: "+ somme);
    }

    private static void calcul() {
        for (int i = 1; i <= 10; i++) {
            somme += i;
        }
    }
}
