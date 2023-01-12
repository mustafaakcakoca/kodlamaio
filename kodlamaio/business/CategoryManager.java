package kodlamaio.business;
import kodlamaio.core.logging.baseLogger;
import kodlamaio.core.validator.categoryValidator;
import kodlamaio.dataAccess.baseCategoryDao;
import kodlamaio.entities.Category;
public class CategoryManager {
    private baseCategoryDao categoryDao;
    private baseLogger[] loggers;
    public CategoryManager(baseCategoryDao categoryDao,baseLogger[] loggers){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }
    public void add(Category category) throws Exception{
        if(categoryValidator.isValid(category)){
            categoryDao.add(category);
            for (baseLogger logger :loggers){
                logger.log("Kategori Eklendi");
            }
        }else{
            throw new Exception("Böyle bir kategori zaten var"+category.getName());
        }
    }
}
