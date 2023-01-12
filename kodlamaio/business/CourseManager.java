package kodlamaio.business;
import kodlamaio.core.validator.courseValidator;
import kodlamaio.dataAccess.baseCourseDao;
import kodlamaio.entities.Course;
public class CourseManager {
    private baseCourseDao courseDao;

    public CourseManager(baseCourseDao courseDao){
        this.courseDao=courseDao;
    }
    public void add(Course course) throws Exception{
        if(courseValidator.isValid(course)&& course.getUnitPrice()>0 ){
            courseDao.add(course);
        }else{
            throw new Exception("Böyle Bir Kurs Zaten Var ya da Yanlış Fiyat Girildi"+course.getCourseSlug());

        }
    }
}
