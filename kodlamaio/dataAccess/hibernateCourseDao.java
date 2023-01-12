package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class hibernateCourseDao implements baseCourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile Kurs Eklendi "+course.getName());
    }

    @Override
    public void remove(Course course) {
        System.out.println("Hibernate ile Kurs Silindi"+course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile Kurs Güncellendi"+course.getName());
    }
}
