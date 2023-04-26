package app_book_market.factory;

public interface EntityFactory<E> {
    E newEntity(Class<E> entity, String name);
}
