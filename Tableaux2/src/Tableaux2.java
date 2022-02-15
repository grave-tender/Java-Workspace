import java.util.Arrays;

public class Tableaux2 {
    public static void main(String[] args) {
        int[] quantities = new int[5];   // all elements set to 0
        Arrays.fill(quantities, 1);      // all elements set to 1

        for(int j : quantities) {
            System.out.print(j + " ");
        }
        System.out.println("");
        
        int nb[] = { 15, 20, 10, 5, 35, 14 };

        Arrays.sort(nb);

        for (int i : nb) {
            System.out.print(i + " ");
        }
    }
}
