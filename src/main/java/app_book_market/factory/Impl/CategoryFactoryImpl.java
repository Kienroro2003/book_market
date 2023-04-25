package app_book_market.factory.Impl;

import app_book_market.factory.CategoryFactory;
import app_book_market.model.Category;

public class CategoryFactoryImpl implements CategoryFactory {
    @Override
    public Category newCategory(String name) {
        final Category category = new Category();
        category.setName(name);
        return category;
    }
}
