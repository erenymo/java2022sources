package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " adlı kategori JDBC ile veritabanına eklendi!");
    }
}
