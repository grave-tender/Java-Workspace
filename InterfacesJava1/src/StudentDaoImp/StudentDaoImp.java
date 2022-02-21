package StudentDaoImp;
import java.util.ArrayList;
import java.util.List;

import StudentDao.Dao;
import model.Student;

public class StudentDaoImp implements Dao{ //implements veut dire que cette class suit ce que Dao dit de faire
    private List<Student> listStudents;
    
    public StudentDaoImp(){
        listStudents = new ArrayList<Student>(); //va creer une List vide de Students
    }

    public void create(Student student){
        listStudents.add(student);
    }; 
    
    public List<Student> findAll(){
        return listStudents;
    }
}
