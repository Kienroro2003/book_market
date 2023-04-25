package app_book_market.repository.impl;

import app_book_market.model.Author;
import app_book_market.model.Book;
import app_book_market.model.Category;
import app_book_market.repository.DatabaseContext;
import app_book_market.repository.Repository;

public class DatabaseContextImpl implements DatabaseContext {
    @Override
    public <E, R extends Repository<E>> R newRepository(Class<E> entityType) {
        if(entityType == Author.class){
            return (R) new AuthorRepositoryImpl();
        }
        if(entityType == Book.class){
            return (R) new BookRepositoryImpl();
        }
        if(entityType == Category.class){
            return (R) new CategoryRepositoryImpl();
        }
        throw new IllegalArgumentException("There is no repository for " + entityType.getName());
    }
}
