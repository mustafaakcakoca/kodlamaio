package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class hibernateCategoryDao implements baseCategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi"+category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile silindi" +category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile güncellendi" +category.getName());
    }
}
