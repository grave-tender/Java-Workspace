package daoImp;

import java.util.List;
import java.util.ArrayList;

import dao.CourseDao;
import model.Course;

public class CourseDaoImp implements CourseDao{
    private List<Course> courses;

    public CourseDaoImp(){
        courses = new ArrayList<Course>();
    }

    public void create(String id, String courseName) {
        courses.add(new Course(id, courseName));
    }

    public void delete(int i) {
        courses.remove(i);
    }

    public List<Course> findAll() {
        return courses;
    }

    public void update(int i, Course course) {
        courses.set(i, course);
    }
    
}
