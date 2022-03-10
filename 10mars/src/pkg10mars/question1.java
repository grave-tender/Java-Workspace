package pkg10mars;

import Tools.utility;

public class question1 extends utility{
    private static int valeurRandom1;
    private static int valeurRandom2;
    private static int max;

    public static void maxEntreValeurs(){
        initialisation();
        calculDuMax();

        println("Soit la valeur premiere valeur est: "+valeurRandom1+"\net soit la deuxiemme valeur est: " + valeurRandom2);
        println("Le maximum est: "+ max);
    }

    private static void initialisation() {
        valeurRandom1 = randomInt();
        valeurRandom2 = randomInt();
    }

    private static void calculDuMax() {
        if(valeurRandom1 > valeurRandom2)
            max = valeurRandom1;
        else if(valeurRandom1 < valeurRandom2)
            max = valeurRandom2;
        else{
            println("Le deux valeurs sont egales");
            max = valeurRandom1;
        }
    }
}
