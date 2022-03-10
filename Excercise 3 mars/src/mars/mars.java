package mars;

import java.util.Scanner;

public class mars {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] inputNbTab = new int[2];
        inputNbTab = saisieDesNombres();

        println("1st: " + inputNbTab[0] + "\t2nd: " + inputNbTab[1]);
    }

    private static int[] saisieDesNombres() {
        int[] tab = new int[2];

        int divider, divided;

        println("Please enter a number to divide (int):");
        divided = (int) scNextInt();
        println("Please enter divider (int):");
        divider = (int) scNextInt();

        tab[0] = divided;
        tab[1] = divider;

        return tab;
    }

    private static int scNextInt() {
        int inputNb = 0;

        try {
            inputNb = sc.nextInt();
        } catch (Exception e) {
            println("Please enter a valid integer");
            sc.nextLine(); // or sc.next();
            return scNextInt();
        }
        return inputNb;
    }

    private static void println(String msg) {
        System.out.println(msg);
    }
}