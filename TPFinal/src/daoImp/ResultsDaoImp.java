package daoImp;

import java.util.List;
import java.util.ArrayList;

import dao.ResultsDao;
import model.Course;
import model.Results;
import model.Student;

public class ResultsDaoImp implements ResultsDao {
    List<Results> results;

    public ResultsDaoImp(){
        results = new ArrayList<Results>();
    }

    public void create(Student student, Course course, double marks1, double marks2) {
        results.add(new Results(student, course, marks1, marks2));
    }

    public void delete(int i) {
        results.remove(i);
    }

    public List<Results> findAll() {
        return results;
    }

    public void update(int i, Results result) {
        results.set(i, result);
    }
    
}
