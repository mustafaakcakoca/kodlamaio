package kodlamaio.business;
import kodlamaio.dataAccess.BasePersonDao;
import kodlamaio.entities.Person;

public class TeacherManager extends BasePersonManager {
public TeacherManager(BasePersonDao personDao){
    super(personDao);
}
}
