package quiz;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import model.Passenger;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Passenger> listPassenger = new ArrayList<Passenger>();

        System.out.println("Input of passengers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the ID of the passenger " + i + ": ");
            int id = sc.nextInt();
            System.out.println("Enter the name of the passenger " + i + ": ");
            String name = sc.next();
            System.out.println("Enter the gender of the passenger " + i + ": ");
            char gender = sc.next().charAt(0);

            listPassenger.add(new Passenger(id, name, gender));
        }

        System.out.println("\nPrinting list of passengers with while");
        int counter = 0;
        while (counter < listPassenger.size()){
            System.out.print("id: "+listPassenger.get(counter).getId());
            System.out.print("\tname: "+listPassenger.get(counter).getName());
            System.out.print("\tgender: "+listPassenger.get(counter).getGender()+"\n");
            counter++;
        }

        System.out.println("\nPrinting list of passengers with for each");
        for (Passenger p : listPassenger) {
            System.out.print("id: "+p.getId());
            System.out.print("\tname: "+p.getName());
            System.out.print("\tgender: "+p.getGender()+"\n");
        }

        listPassenger.clear();
    }
}
