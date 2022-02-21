package interfacesjava1;

import java.util.List;

import StudentDao.Dao;
import StudentDaoImp.StudentDaoImp;
import model.Student;

public class InterfacesJava1 {
    public static void main(String[] args) {
        Dao dao = new StudentDaoImp(); //Java encourage l'utilisation du type interface

        Student stud1 = new Student("Carlos", "Leon");
        dao.create(stud1);   

        Student stud2 = new Student("Daisy", "Pattenron");
        dao.create(stud2);

        List<Student> students = dao.findAll();

        for(Student s : students) {
            System.out.println(s.getFirstName());
        }
    }
    
}
