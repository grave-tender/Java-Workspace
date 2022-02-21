package interfaces;

import java.util.List;

import model.Cours;

public interface CoursDao {
    void create(Cours cours);

    List<Cours> findAll();
}
