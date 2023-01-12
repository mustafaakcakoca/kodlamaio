package kodlamaio.core.validator;
import kodlamaio.entities.Category;

public class categoryValidator {
    public static boolean isValid(Category category){
        String[] categories = {"Sql","C#","Java"};
        boolean categoryState=true;

        for (String str:categories) {
            if(category.getName()==str){
                categoryState=false;
            }
        }
        return categoryState;
    }

}
