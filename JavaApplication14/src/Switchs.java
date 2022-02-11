import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {
        int ville;
        boolean exit = false;
        String pays = "";

        while(!exit) {
            ville = choixMenu();

            switch (ville) {
                //cas de Havana
                case 1:
                    pays = "Espagne";
                    break;
                //cas de Paris
                case 2:
                    pays = "France";
                    break;
                //cas de Santiago
                case 3:
                    pays = "Chili";
                    break;
                //cas de Montreal
                case 4:
                    pays = "Canada";
                    break;
                //default Exit
                default:
                    exit = true;
                    break;
            }

            System.out.println("Votre ville se trouve dans le pays: " + pays);
        }

        /*
        if(ville == 1) pays = "Espagne";
        else if(ville == 2) pays = "France";
        else if(ville == 3) pays = "Chili";
        else pays = "Canada";
        */


    }
    
    static int choixMenu(){
        Scanner sc = new Scanner(System.in);

        System .out.println("1. Havana");
        System.out.println("2. Paris");
        System.out.println("3. Santiago");
        System.out.println("4. Montreal");
        System.out.println("5. Exit");
        
        return sc.nextInt();
    }
}