package app_book_market;

import app_book_market.factory.ConnectionFactory;
import app_book_market.factory.Impl.ConnectionFactoryImpl;
import app_book_market.repository.DatabaseContext;
import app_book_market.repository.impl.DatabaseContextImpl;
import lombok.Getter;

public final class BookApplication {
    @Getter
    private final ConnectionFactory connectionFactory;
    @Getter
    private final DatabaseContext databaseContext;
    private static final BookApplication INSTANCE = new BookApplication();

    private BookApplication() {
        connectionFactory = new ConnectionFactoryImpl();
        databaseContext = new DatabaseContextImpl();
    }

    public static BookApplication getInstance(){
        return INSTANCE;
    }
}
