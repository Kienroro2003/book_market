package app_book_market.build.impl;

import app_book_market.build.Builder;
import app_book_market.model.Author;

public class AuthorBuilder implements Builder<Author> {
    private long id;
    private String name;

    public AuthorBuilder id(long id){
        this.id = id;
        return this;
    }

    public AuthorBuilder name(String name){
        this.name = name;
        return this;
    }
    @Override
    public Author build() {
        Author author = new Author();
        author.setId(id);
        author.setName(name);
        return author;
    }
}
