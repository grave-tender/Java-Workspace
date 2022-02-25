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

    private int getCoursPosByCoursId(String coursId){
        for(int i = 0; i < listeCours.size(); i++){
            Cours cr = listeCours.get(i);
            if(cr.getCoursID().equals(coursId)) return i;
        }
        throw new IllegalArgumentException("Id n'a pas été trouvé'");
    }

    public Cours findById(String coursID) {
        int pos = getCoursPosByCoursId(coursID);
        return listeCours.get(pos);
    }

    /**
     * efface le premier Cours qui match le coursID
     * @param String coursID
     */
    public void deleteById(String coursID) {
        int pos = getCoursPosByCoursId(coursID);
        listeCours.remove(pos);
    }
}
