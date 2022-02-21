package implementations;

import interfaces.CoursDao;
import model.Cours;

import java.util.ArrayList;
import java.util.List;

public class CoursDaoImp implements CoursDao{
    private List<Cours> listeCours;

    public CoursDaoImp(){
        listeCours = new ArrayList<Cours>();
    }

    public void create(Cours cours){
        listeCours.add(cours);
    }

    public List<Cours> findAll(){
        return listeCours;
    }
}
