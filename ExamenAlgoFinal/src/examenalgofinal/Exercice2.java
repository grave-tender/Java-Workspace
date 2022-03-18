package examenalgofinal;

public class Exercice2 extends Utilities {
    
    private static int nb1;
    private static int nb2;
    private static int nb3;
    private static int min;

    public static void minEntre3Valeurs(){
        debutDeExercise(2);
        initialisation();
        calculDuMin();

        reponse();
    }

    private static void initialisation() {
        nb1 = randomInt();
        nb2 = randomInt();
        nb3 = randomInt();
    }

    //on compare si nb1 est le plus petit, sinon on compare si nb2 est le plus petit, si dans aucun des cas, nb3 est le plus petit
    private static void calculDuMin() {
        if(nb1 < nb2 && nb1 < nb3)
            min = nb1;
        else if(nb2 < nb3)
            min = nb2;
        else 
            min = nb3;
    }

    //imprime la reponse de l'exercise
    private static void reponse() {
        println("Soit la valeur premiere valeur est: "+nb1);
        println("et soit la deuxiemme valeur est: " + nb2);
        println("et soit la troisiemme valeur est: " + nb3);
        println("Le minimum est: "+ min);
    }
}
