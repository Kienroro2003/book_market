package app_book_market.view;

import app_book_market.BookApplication;
import app_book_market.model.Author;
import app_book_market.model.Book;
import app_book_market.model.Category;
import app_book_market.repository.AuthorRepository;
import app_book_market.repository.BookRepository;
import app_book_market.repository.CategoryRepository;
import app_book_market.repository.DatabaseContext;

public class BookApplicationStartup {
    public static void main(String[] args) throws Exception {
        final BookApplication application = BookApplication.getInstance();
        final DatabaseContext databaseContext = application.getDatabaseContext();
        final AuthorRepository authorRepository = application.getDatabaseContext().newRepository(Author.class);
        final BookRepository bookRepository = application.getDatabaseContext().newRepository(Book.class);
        final CategoryRepository categoryRepository = application.getDatabaseContext().newRepository(Category.class);

        final Author author = new Author();
        author.setName("Kien");
        authorRepository.save(author);


    }
}
