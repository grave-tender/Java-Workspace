package coursDaoJava;

import java.util.List;

import model.Cours;
import interfaces.CoursDao;
import implementations.CoursDaoImp;

import model.Employee;
import interfaces.EmployeeDao;
import implementations.EmployeeDaoImp;

public class App {
    public static void main(String[] args) {
        //Creation des instances
        Cours c1 = new Cours("1", "Algo");
        Cours c2 = new Cours("2", "OS");
        Cours c3 = new Cours("3", "Math");

        Employee e1 = new Employee(1 , "Lazri", "Toufik");
        Employee e2 = new Employee(2, "RD", "David");

        //instantiation des interfaces
        CoursDao daoCours = new CoursDaoImp();
        EmployeeDao daoEmployee = new EmployeeDaoImp();

        //ajout des valeurs
        daoCours.create(c1);
        daoCours.create(c2);
        daoCours.create(c3);

        daoEmployee.create(e1);
        daoEmployee.create(e2);


        //trouver tous les elementes de note Base de Donnes
        List<Cours> listeCours = daoCours.findAll();
        List<Employee> listEmployees = daoEmployee.findAll();


        //affichage des listes
        for(Cours c: listeCours) {
            System.out.println("coursID: "+ c.getCoursID() + "\tcoursNom: "+ c.getCoursNom());
        }

        for(Employee e: listEmployees){
            System.out.println("id: "+ e.getId() +"\tprenom: "+ e.getPrenom() +"\tnom: "+ e.getNom());
        }

        //trouver Instance par indice
        Cours coursTrouvee = daoCours.findById("1");
        System.out.println("fetched coursID: "+ coursTrouvee.getCoursID() +"\tcoursNom: "+ coursTrouvee.getCoursNom());
    
        Employee employeeTrouvee = daoEmployee.findById(1);
        System.out.println("fetched employeeId: "+ employeeTrouvee.getId() +"\temployeePrenom: "+ employeeTrouvee.getPrenom() +" employeeNom: "+ employeeTrouvee.getNom());
    
        //effacer un element par indice
        System.out.println("Effacement de certains elements...");
        daoCours.deleteById("2");
        daoEmployee.deleteById(2);

        //re-affichage des listes
        for(Cours c: listeCours) {
            System.out.println("coursID: "+ c.getCoursID() + "\tcoursNom: "+ c.getCoursNom());
        }

        for(Employee e: listEmployees){
            System.out.println("id: "+ e.getId() +"\tprenom: "+ e.getPrenom() +"\tnom: "+ e.getNom());
        }
    }
}
