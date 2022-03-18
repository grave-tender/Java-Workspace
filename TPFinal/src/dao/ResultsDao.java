package dao;

import java.util.List;
import model.Results;
import model.Student;
import model.Course;

public interface ResultsDao {
    void create(Student student, Course course, double marks1, double marks2);

    void delete(int i);

    List<Results> findAll();

    void update(int i, Results result);
}
