package StudentDao;
import model.Student;
import java.util.List;

/**
 * on a cree cette classe pour nous aider a creer des Students
 */
public interface Dao {

    public abstract void create(Student student); //recoit un etudiant et ne retourne rien. Default public
    
    public Student findById(int i);
    
    public List<Student> findAll(); //Signature
}
