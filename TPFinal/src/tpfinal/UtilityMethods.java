package tpfinal;

import java.util.List;
import java.util.Scanner;

public class UtilityMethods {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPositionInListRange(int pos, List list) {
        return (pos <= list.size() - 1 && pos >= 0);
    }

    public static void success(String verb) {
        println("Succesfully " + verb);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    @SuppressWarnings("InfiniteRecursion")
    public static int scNextInt() {
        int inputNb;

        try {
            inputNb = sc.nextInt();
        } catch (Exception e) {
            println("Please enter a valid integer");
            sc.nextLine();
            return scNextInt();
        }
        return inputNb;
    }
}
