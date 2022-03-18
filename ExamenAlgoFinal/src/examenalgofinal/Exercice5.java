package examenalgofinal;

public class Exercice5 extends Utilities{
    private static int[] tab = {20, 10, 25, 30};
    private static int somme;

    public static void sommeTableau() {
        debutDeExercise(5);
        calcul();

        println("La somme de tous les elements superieurs ou egal a 20 du tableau est: " + somme);
    }

    //on additionne toutes les valeurs de tab superieures ou egales a 20
    private static void calcul() {
        for (int i : tab)
            somme += (i >= 20) ? i : 0; //forme ternaire
    }
}
