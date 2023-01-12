package kodlamaio.dataAccess;
import  kodlamaio.entities.Course;
public interface baseCourseDao {
    void add(Course course);
    void remove(Course course);
    void update(Course course);
}
