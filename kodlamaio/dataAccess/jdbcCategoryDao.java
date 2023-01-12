package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class jdbcCategoryDao implements baseCategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile eklendi "+category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile silindi "+category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile güncellendi"+category.getName());
    }
}
