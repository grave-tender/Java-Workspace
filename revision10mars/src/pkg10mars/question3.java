package pkg10mars;

import Tools.utility;

public class question3 extends utility{
    private static int nbTab[] = new int[10];
    private static int somme;
    private static int max = 0;

    public static void sommeEtMaxDunTableau() {
        initialisation();
        calcul();

        reponseALaQuestion();
    }

    private static void initialisation() {
        for (int i = 0; i < nbTab.length; i++) {
            nbTab[i] = randomInt();
        }
    }

    private static void calcul() {
        for (int i : nbTab) {
            somme += i;
            if (i > max)
                max = i;
        }
    }

    private static void reponseALaQuestion() {
        String tableau = "";

        for (int i : nbTab) {
            tableau += i + " ";
        }

        println("\nPour le tableau de: " + tableau);
        println("La somme de toutes les valeurs est: " + somme);
        println("La valeur maximale du tableau: " + max);
    }
}
