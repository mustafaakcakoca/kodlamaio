package kodlamaio.dataAccess;
import kodlamaio.entities.Person;
public interface BasePersonDao {
    void add(Person person);
    void remove(Person person);
    void update(Person person);


}
