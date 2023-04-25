package app_book_market.factory;

import app_book_market.model.Author;

public interface AuthorFactory {
    Author newAuthor(String name);
}
