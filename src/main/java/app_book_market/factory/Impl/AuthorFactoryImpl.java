package app_book_market.factory.Impl;

import app_book_market.factory.AuthorFactory;
import app_book_market.model.Author;

public class AuthorFactoryImpl implements AuthorFactory {
    @Override
    public Author newAuthor(String name) {
        final Author author = new Author();
        author.setName(name);
        return author;
    }
}
