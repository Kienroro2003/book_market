package app_book_market.repository;

public interface DatabaseContext {
    <E, R extends Repository<E>> R newRepository(Class<E> entityType);
}
