package app_book_market;

import app_book_market.factory.ConnectionFactory;
import app_book_market.factory.Impl.ConnectionFactoryImpl;
import lombok.Getter;

public final class BookApplication {
    @Getter
    private final ConnectionFactory connectionFactory;
    private static final BookApplication INSTANCE = new BookApplication();

    private BookApplication() {
        connectionFactory = new ConnectionFactoryImpl();
    }

    public static BookApplication getInstance(){
        return INSTANCE;
    }
}
