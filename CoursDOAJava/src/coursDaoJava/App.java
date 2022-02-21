package coursDaoJava;

import java.util.List;

import model.Cours;
import interfaces.CoursDao;
import implementations.CoursDaoImp;

public class App {
    public static void main(String[] args) {
        Cours c1 = new Cours("1", "Algo");
        Cours c2 = new Cours("2", "OS");
        Cours c3 = new Cours("3", "Math");

        CoursDao daoCours = new CoursDaoImp();

        daoCours.create(c1);
        daoCours.create(c2);
        daoCours.create(c3);

        List<Cours> listeCours = daoCours.findAll();

        for(Cours c: listeCours) {
            System.out.println("coursID: "+ c.getCoursID() + "\tcoursName: "+ c.getCoursNom());
        }
    }
}
