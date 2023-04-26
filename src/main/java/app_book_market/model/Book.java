package app_book_market.model;

import lombok.ToString;

@ToString
public class Book {
    private long id;
    private String name;
    private long authorId;
    private long categoryId;

    public Book() {
    }

    public Book(long id, String name, long authorId, long categoryId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
        this.categoryId = categoryId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
