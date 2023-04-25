package app_book_market.factory;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection newConnection() throws Exception;
}
