package kodlamaio.business;
import kodlamaio.dataAccess.BasePersonDao;
import kodlamaio.entities.Person;
public class BasePersonManager {
    BasePersonDao personDao;
    public BasePersonManager(BasePersonDao personDao){
        this.personDao=personDao;
    }
    public void add(Person person){
        personDao.add(person);
    }
}
