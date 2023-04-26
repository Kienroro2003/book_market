package app_book_market.factory;

import app_book_market.build.impl.CategoryBuilder;

public interface CategoryFactory {
    CategoryBuilder newCategory(String name);
}
