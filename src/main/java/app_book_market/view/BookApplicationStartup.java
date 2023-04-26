package app_book_market.view;

import app_book_market.BookApplication;
import app_book_market.build.Builder;
import app_book_market.build.impl.AuthorBuilder;
import app_book_market.build.impl.BookBuilder;
import app_book_market.build.impl.CategoryBuilder;
import app_book_market.factory.EntityFactory;
import app_book_market.factory.Impl.EntityFactoryImpl;
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
        final AuthorRepository authorRepository = databaseContext.newRepository(Author.class);
        final BookRepository bookRepository = databaseContext.newRepository(Book.class);
        final CategoryRepository categoryRepository = databaseContext.newRepository(Category.class);
        final EntityFactory<Builder> entityFactory = new EntityFactoryImpl();

        final Category category = entityFactory.newEntityBuilder(CategoryBuilder.class).name("Comic").build();
        categoryRepository.save(category);
        final Author author = entityFactory.newEntityBuilder(AuthorBuilder.class).name("Kienroro").build();
        authorRepository.save(author);
        final Book book = entityFactory.newEntityBuilder(BookBuilder.class).name("Design Pattern").authorId(author.getId()).categoryId(category.getId()).build();
        System.out.println(book);
        bookRepository.save(book);


    }
}
