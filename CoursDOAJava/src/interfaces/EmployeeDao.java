package interfaces;
import model.Employee;
import java.util.List;

public interface EmployeeDao {
    void create(Employee employee);

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(int id);
}
