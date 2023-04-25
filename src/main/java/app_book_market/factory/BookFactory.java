package app_book_market.factory;

import app_book_market.model.Book;

public interface BookFactory {
    Book newBook(String name);
}
