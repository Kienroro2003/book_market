package app_book_market.factory;

import app_book_market.build.impl.BookBuilder;
import app_book_market.model.Book;

public interface BookFactory {
    BookBuilder newBook(String name);
}
