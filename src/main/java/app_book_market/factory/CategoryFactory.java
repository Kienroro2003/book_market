package app_book_market.factory;

import app_book_market.model.Category;

public interface CategoryFactory {
    Category newCategory(String name);
}
