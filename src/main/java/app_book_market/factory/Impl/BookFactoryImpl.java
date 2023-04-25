package app_book_market.factory.Impl;

import app_book_market.factory.BookFactory;
import app_book_market.model.Book;

public class BookFactoryImpl implements BookFactory {
    @Override
    public Book newBook(String name) {
        final Book book = new Book();
        book.setName(name);
        return book;
    }
}
