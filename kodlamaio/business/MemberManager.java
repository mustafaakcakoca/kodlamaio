package kodlamaio.business;
import kodlamaio.dataAccess.BasePersonDao;

public class MemberManager extends BasePersonManager {
    public MemberManager(BasePersonDao personDao){
        super(personDao);
    }
}
