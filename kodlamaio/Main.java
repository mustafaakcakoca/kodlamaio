package kodlamaio;

import kodlamaio.business.BasePersonManager;
import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.TeacherManager;
import kodlamaio.business.MemberManager;
import kodlamaio.core.logging.baseLogger;
import kodlamaio.core.logging.databaseLogger;
import kodlamaio.core.logging.emailLogger;
import kodlamaio.core.logging.fileLogger;
import kodlamaio.dataAccess.hibernateMemberDao;
import kodlamaio.dataAccess.hibernateCategoryDao;
import kodlamaio.dataAccess.hibernateCourseDao;
import kodlamaio.dataAccess.jdbcCategoryDao;
import kodlamaio.dataAccess.jdbcMemberDao;
import kodlamaio.dataAccess.jdbcCourseDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Member;
import kodlamaio.entities.Course;
import kodlamaio.entities.Teacher;


public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher1=new Teacher();
        teacher1.setId(1);
        teacher1.setFullName("Engin Demiroğ");
        teacher1.setAvatar("engin.jpg");
        teacher1.setBio("Açıklama");
        String[] courses={"C#","Java"};
        teacher1.setMyCourses(courses);

        BasePersonManager personManager=new BasePersonManager(new hibernateMemberDao());
        personManager.add(teacher1);

        Category category1=new Category();
        category1.setId(1);
        category1.setName("Python");
        category1.setDescription("Açıklama");

        Category category2=new Category();
        category2.setId(2);
        category2.setName("PHP");
        category2.setDescription("Açıklama");

        Category category3=new Category();
        category3.setId(3);
        category3.setName("SQL");
        category3.setDescription("AÇIKLAMA");
        baseLogger[] loggers={new fileLogger(),new emailLogger(),new databaseLogger()};
        CategoryManager categoryManager=new CategoryManager(new hibernateCategoryDao(),loggers);


        categoryManager.add(category1);

        CategoryManager categoryManager1=new CategoryManager(new jdbcCategoryDao(),loggers);
        categoryManager1.add(category2);

        CategoryManager categoryManager2=new CategoryManager(new hibernateCategoryDao(),loggers);
        categoryManager2.add(category3);
        Course course1=new Course();
        course1.setId(1);
        course1.setName("Java");
        course1.setUnitPrice(200);



        Course course2=new Course();
        course2.setId(2);
        course2.setName("PHP");
        course2.setUnitPrice(0);


        Course course3=new Course();
        course3.setId(3);
        course3.setName("SQL");
        course3.setUnitPrice(200);

        CourseManager courseManager=new CourseManager(new jdbcCourseDao());
        courseManager.add(course1);

        CourseManager courseManager1=new CourseManager(new hibernateCourseDao());
        courseManager1.add(course2);
        courseManager1.add(course3);

    }
}
