package dao;

import java.util.List;
import model.Course;

public interface CourseDao {
    void create(String id, String courseName);

    void delete(int i);

    List<Course> findAll();

    void update(int i, Course course);
}
