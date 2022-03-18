package examenalgofinal;

public class Exercice3 extends Utilities{
    private static int somme;

    public static void additionsBondsDe2() {
        debutDeExercise(3);
        calcul();
        println("Le resultat de la some est: " + somme);
    }

    //par bonds de 2 on additionne toutes les valeurs de l'index
    private static void calcul() {
        for (int i = 1; i <= 21; i+=2)
            somme+=i;
    }
}
