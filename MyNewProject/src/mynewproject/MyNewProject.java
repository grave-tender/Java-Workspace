package mynewproject;

import java.util.Scanner;

public class MyNewProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 'F';

        System.out.println("Entrer le nom");
        String nom = sc.next();
        
        System.out.println("Entrer le prenom");
        String prenom = sc.next();
        
        System.out.println("Entrer la première note %");
        double note1 = sc.nextInt();
        
        System.out.println("Entrer la dexièmme note %");
        double note2 = sc.nextInt();

        double moyenne = (note1 + note2)/ 2;

        if (moyenne >= 90) grade = 'A';
        else if (moyenne >= 80 && moyenne < 90) grade = 'B';
        else if (moyenne >= 60 && moyenne < 80) grade = 'C';

        System.out.println("nom\tprenom\tgrade");
        System.out.println(nom+"\t"+prenom+"\t\u001B[32m"+grade+"\u001B[0m");
    }
    
}
