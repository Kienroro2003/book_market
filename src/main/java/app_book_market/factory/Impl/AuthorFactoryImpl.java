package app_book_market.factory.Impl;

import app_book_market.build.impl.AuthorBuilder;
import app_book_market.factory.AuthorFactory;
import app_book_market.model.Author;

public class AuthorFactoryImpl implements AuthorFactory {
    @Override
    public AuthorBuilder newAuthor(String name) {
        return new AuthorBuilder();
    }
}
