package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public interface baseCategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
}
