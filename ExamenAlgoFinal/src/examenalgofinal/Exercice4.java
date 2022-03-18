package examenalgofinal;

public class Exercice4 extends Utilities{
    private static int somme;

    public static void calculModulo() {
        debutDeExercise(4);
        calcul();
        
        println("Le resultat du calcul est: " + somme);
    }

    //on inverse le symbole du negatif selon si le chiffre est pair ou impair
    private static void calcul() {
        for (int i = 1; i <= 21; i++){
            int symbole = (i%2 == 1) ? 1 : -1;
            somme+=symbole*i;
        }
    }
}
