package app_book_market.build.impl;

import app_book_market.build.Builder;
import app_book_market.model.Book;

public class BookBuilder implements Builder<Book> {
    private long id;
    private String name;
    private long authorId;
    private long categoryId;

    public BookBuilder id(long id){
        this.id = id;
        return this;
    }

    public BookBuilder name(String name){
        this.name = name;
        return this;
    }

    public BookBuilder authorId(long authorId){
        this.authorId = authorId;
        return this;
    }

    public BookBuilder categoryId(long categoryId){
        this.categoryId = categoryId;
        return this;
    }
    @Override
    public Book build() {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthorId(authorId);
        book.setCategoryId(categoryId);
        return book;
    }
}
