package app_book_market.factory.Impl;

import app_book_market.build.Builder;
import app_book_market.build.impl.AuthorBuilder;
import app_book_market.build.impl.BookBuilder;
import app_book_market.build.impl.CategoryBuilder;
import app_book_market.factory.AuthorFactory;
import app_book_market.factory.BookFactory;
import app_book_market.factory.CategoryFactory;
import app_book_market.factory.EntityFactory;
import app_book_market.model.Author;
import app_book_market.model.Book;
import app_book_market.model.Category;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EntityFactoryImpl<E> implements EntityFactory<E> {
    private final AuthorFactory authorFactory = new AuthorFactoryImpl();
    private final BookFactory bookFactory = new BookFactoryImpl();
    private final CategoryFactory categoryFactory = new CategoryFactoryImpl();
    private Map<Class<?>, Supplier<Builder>> entityBuilderSuppliers;

    public EntityFactoryImpl() {
        this.entityBuilderSuppliers = new HashMap<>();
        entityBuilderSuppliers.put(AuthorBuilder.class, AuthorBuilder::new);
        entityBuilderSuppliers.put(CategoryBuilder.class, CategoryBuilder::new);
        entityBuilderSuppliers.put(BookBuilder.class, BookBuilder::new);
    }

    @Override
    public E newEntity(Class<E> entity, String name) {
        if(entity == Author.class){
            return (E) authorFactory.newAuthor(name);
        }
        if(entity == Category.class){
            return (E) categoryFactory.newCategory(name);
        }
        if(entity == Book.class){
            return (E) bookFactory.newBook(name);
        }
        throw new IllegalArgumentException("There is not factory for: " + entity);
    }

    @Override
    public <E, B extends Builder<E>> B newEntityBuilder(Class<B> builderType){
        return (B) entityBuilderSuppliers.get(builderType).get();
    }
}
