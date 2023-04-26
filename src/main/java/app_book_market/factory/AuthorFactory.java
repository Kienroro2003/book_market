package app_book_market.factory;

import app_book_market.build.impl.AuthorBuilder;
import app_book_market.model.Author;

public interface AuthorFactory {
    AuthorBuilder newAuthor(String name);
}
