package app_book_market.factory.Impl;

import app_book_market.factory.AuthorFactory;
import app_book_market.factory.BookFactory;
import app_book_market.factory.CategoryFactory;
import app_book_market.factory.EntityFactory;
import app_book_market.model.Author;
import app_book_market.model.Book;
import app_book_market.model.Category;

public class EntityFactoryImpl implements EntityFactory {
    private final AuthorFactory authorFactory = new AuthorFactoryImpl();
    private final BookFactory bookFactory = new BookFactoryImpl();
    private final CategoryFactory categoryFactory = new CategoryFactoryImpl();
    @Override
    public Object newEntity(Class entity, String name) {
        if(entity == Author.class){
            return authorFactory.newAuthor(name);
        }
        if(entity == Category.class){
            return categoryFactory.newCategory(name);
        }
        if(entity == Book.class){
            return bookFactory.newBook(name);
        }
        throw new IllegalArgumentException("There is not factory for: " + entity);
    }
}
