package examenalgofinal;

public class Exercice6 extends Utilities{
    private static String[] tabVilles = {"Madrid", "Montreal", "Madrid", "Havana", "Madrid"};
    private static int madrid;

    public static void compteurMadrid() {
        debutDeExercise(6);

        calculMadrid();
        println("Il y a "+madrid+" Madrids dans le tableau des villes");
    }

    //compte combien de fois Madrid est dans le tableau tabVilles
    private static void calculMadrid() {
        for (String ville : tabVilles) {
            if (ville.equals("Madrid"))
                madrid++;
        }
    }
}