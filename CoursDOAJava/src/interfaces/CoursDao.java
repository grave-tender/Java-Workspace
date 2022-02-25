package interfaces;
import java.util.List;
import model.Cours;

/**
 * interface pour implementer une structure DAO dans nos listes
 */
public interface CoursDao {
    void create(Cours cours);

    List<Cours> findAll();

    Cours findById(String coursID);

    void deleteById(String coursID);
}
