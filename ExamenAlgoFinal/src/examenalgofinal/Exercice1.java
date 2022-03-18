package examenalgofinal;

public class Exercice1 extends Utilities {
    
    private static int nb1;
    private static int nb2;
    private static int min;

    public static void minEntre2Valeurs(){
        debutDeExercise(1);
        initialisation();
        calculDuMin();

        reponse();
    }

    private static void initialisation() {
        nb1 = randomInt();
        nb2 = randomInt();
    }

    //regarde lequel entre nb1 et nb2 est le plus petit
    private static void calculDuMin() {
        if(nb1 < nb2)
            min = nb1;
        else
            min = nb2;
    }
    
    //imprime la reponse de l'exercise
    private static void reponse() {
        println("Soit la valeur premiere valeur est: "+nb1);
        println("et soit la deuxiemme valeur est: " + nb2);
        println("Le minimum est: "+ min);
    }
}
