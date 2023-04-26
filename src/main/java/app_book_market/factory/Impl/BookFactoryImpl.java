package app_book_market.factory.Impl;

import app_book_market.build.impl.BookBuilder;
import app_book_market.factory.BookFactory;
import app_book_market.model.Book;

public class BookFactoryImpl implements BookFactory {
    @Override
    public BookBuilder newBook(String name) {
        return new BookBuilder();
    }
}
