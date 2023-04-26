package app_book_market.build.impl;

import app_book_market.build.Builder;
import app_book_market.model.Category;

public class CategoryBuilder implements Builder<Category> {
    private long id;
    private String name;

    public CategoryBuilder id(long id){
        this.id = id;
        return this;
    }

    public CategoryBuilder name(String name){
        this.name = name;
        return this;
    }
    @Override
    public Category build() {
        Category category = new Category();
        category.setName(name);
        category.setId(id);
        return category;
    }
}
