package implementations;
import java.util.List;
import java.util.ArrayList;

import interfaces.EmployeeDao;
import model.Employee;

public class EmployeeDaoImp implements EmployeeDao{
    private List<Employee> listEmployees;

    public EmployeeDaoImp(){
        listEmployees = new ArrayList<Employee>();
    }

    public void create(Employee employee) {
        listEmployees.add(employee);
    }

    public List<Employee> findAll() {
        return listEmployees;
    }

    public Employee findById(int i) {
        return listEmployees.get(i);
    }

    public void deleteById(int i) {
        listEmployees.remove(i);
    }
}
