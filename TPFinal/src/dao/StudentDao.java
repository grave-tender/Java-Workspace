package dao;

import java.util.List;
import model.Student;

public interface StudentDao {
    void create(String id, String firstName, String lastName, char gender);

    void delete(int i);

    List<Student> findAll();
}
