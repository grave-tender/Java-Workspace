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

    private int getPositionEmployeeById(int id){
        for(int i = 0; i < listEmployees.size(); i++){
            Employee em = listEmployees.get(i);
            if(em.getId()==i) return i;
        }
        throw new IllegalStateException("Employee non trouvé");
    }

    public Employee findById(int id) {
        int pos = getPositionEmployeeById(id);
        return listEmployees.get(pos);
    }

    public void deleteById(int id) {
        int pos = getPositionEmployeeById(id);
        listEmployees.remove(pos);
    }
}
