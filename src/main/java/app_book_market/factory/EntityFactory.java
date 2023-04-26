package app_book_market.factory;

import app_book_market.build.Builder;

public interface EntityFactory<E> {
    E newEntity(Class<E> entity, String name);
    <E, B extends Builder<E>> B newEntityBuilder(Class<B> builderType);
}
