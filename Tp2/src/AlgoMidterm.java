//il n'y a pas de package car j'ai déplacé ce fichier dans le default package sur NetBeans

//importe Scanner de la library de java
import java.util.Scanner;

public class AlgoMidterm {
    public static void main(String[] args) {
        //création d'une instance de Scanner
        Scanner sc = new Scanner(System.in);

        //initialisation
        int a, b, c;
        int max;

        //saisie des données a, b et c
        System.out.println("Entrez la première valeur: ");
        a = sc.nextInt();

        System.out.println("Entrez la deuxièmme valeur: ");
        b = sc.nextInt();

        System.out.println("Entrez la dernière valeur: ");
        c = sc.nextInt();

        //appel de la custom method "calculateMax"
        max = calculateMax(a, b, c);
        
        //fin du programme
        System.out.println("La valeur maximale est: "+ max);
    }

    public static int calculateMax(int a, int b, int c) {
        if(a > b && a > c) return a;
        if(b > c) return b;
        return c;
    }
}
