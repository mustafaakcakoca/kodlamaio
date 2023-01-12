package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class jdbcCourseDao implements baseCourseDao{
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile Kurs Eklendi"+course.getName());
    }

    @Override
    public void remove(Course course) {
        System.out.println("JDBC ile Kurs Silindi"+course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("JDBC ile Kurs Güncellendi"+course.getName());
    }
}
