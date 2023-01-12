package kodlamaio.core.validator;

import kodlamaio.entities.Course;

public class courseValidator {
    public static boolean isValid(Course course){
    String[] categories = {"Sql","C#","Java"};
    boolean courseState=true;

        for (String str:categories) {
            if(course.getName()==str){
                courseState=false;
            }
        }
        return courseState;
    }
}
