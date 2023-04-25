package app_book_market.repository;

import java.sql.Connection;

public interface Repository<E> {
    void save(E entity) throws Exception;
//    {
//        final Connection connection = newConnection();
//        doSave(connection, entity);
//    }

//    private void doSave(Connection connection, E entity) {
//
//    }
//
//    protected abstract Connection newConnection();
}
