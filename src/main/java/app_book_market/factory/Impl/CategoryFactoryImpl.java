package app_book_market.factory.Impl;

import app_book_market.build.impl.CategoryBuilder;
import app_book_market.factory.CategoryFactory;
import app_book_market.model.Category;

public class CategoryFactoryImpl implements CategoryFactory {
    @Override
    public CategoryBuilder newCategory(String name) {
        return new CategoryBuilder();
    }
}
