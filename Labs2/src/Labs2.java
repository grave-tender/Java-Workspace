import java.util.Scanner;

public class Labs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks1, marks2, marks3;
        int average;

        System.out.println("Entrez la premiere note:");
        marks1 = sc.nextDouble();
        
        System.out.println("Entrez la deuxiemme note:");
        marks2 = sc.nextDouble();
        
        System.out.println("Entrez la troisiemme note:");
        marks3 = sc.nextDouble();
        
        average = averageCalculator(marks1, marks2, marks3);

        char grade = gradeCalculator(average);

        sortieDesDonnes(marks1, marks2, marks3, average, grade);
    }

    static int averageCalculator(double marks1, double marks2, double marks3){
        return (int) (marks1 + marks2 + marks3)/ 3;
    }

    static char gradeCalculator(int average) {
        if(average >= 90) return 'A';
        if(average >= 80) return 'B';
        if(average >= 60) return 'C';
        return 'F';
    }

    static void sortieDesDonnes(double marks1, double marks2, double marks3, int average, char grade){
        System.out.println("note 1: " + marks1);
        System.out.println("note 2: " + marks2);
        System.out.println("note 3: " + marks3);
        System.out.println("moyenne: "+ average);
        System.out.println("note finale: " + grade);
    }
}
