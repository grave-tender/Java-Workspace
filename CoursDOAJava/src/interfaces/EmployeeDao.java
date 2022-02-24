package interfaces;
import model.Employee;
import java.util.List;

public interface EmployeeDao {
    void create(Employee employee);

    List<Employee> findAll();

    Employee findById(int i);

    void deleteById(int i);
}
