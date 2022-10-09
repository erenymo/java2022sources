package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    CategoryDao categoryDao;
    private ArrayList<Category> categories;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, ArrayList<Category> categories, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category ct : categories) {
            if (ct.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kategori ismi tekrar edemez!");
            }
        }
        categories.add(category);
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }

    }
}
