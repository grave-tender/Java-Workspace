import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez combien de $ vous avez emprunté:");
        int loan = sc.nextInt();
        System.out.println("Entrez combien est le taux d'interêt mensuel %:");
        double monthlyInterest = sc.nextDouble();
        System.out.println("In how many years would you like to pay this loan?");
        int yearGoal = sc.nextInt();

        double monthlyPayment = computeMonthlyInterest(loan, monthlyInterest, yearGoal);

        System.out.println("Your monthly payment will need to be " + monthlyPayment + "$ to pay your debt in "+ yearGoal +" years");
    }

    public static double computeMonthlyInterest(int loan, double interestPercent, int year){
        double interest                             = interestPercent/100;
        double monthlyInterestRate     = loan*interest;
        double monthlyPayment           = monthlyInterestRate / (1-(1/Math.pow(( 1+interest ), (year*12))));
        return monthlyPayment;
    }
}