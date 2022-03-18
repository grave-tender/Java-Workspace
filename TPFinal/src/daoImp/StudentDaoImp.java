package daoImp;

import java.util.List;
import java.util.ArrayList;

import dao.StudentDao;
import model.Student;

public class StudentDaoImp implements StudentDao{
    private List<Student> students;

    public StudentDaoImp(){
        students = new ArrayList<Student>();
    }

    public void create(String id, String firstName, String lastName, char gender) {
        students.add(new Student(id, firstName, lastName, gender));
    }

    public void delete(int i) {
        students.remove(i);
    }

    public List<Student> findAll() {
        return students;
    }
    
}
