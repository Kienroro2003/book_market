package app_book_market.repository.impl;

import app_book_market.BookApplication;
import app_book_market.factory.ConnectionFactory;
import app_book_market.model.Author;
import app_book_market.repository.AuthorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AuthorRepositoryImpl implements AuthorRepository {
    private final ConnectionFactory connectionFactory = BookApplication.getInstance().getConnectionFactory();
    @Override
    public void save(Author entity) throws Exception {
        final String query = "INSERT INTO Author (name) VALUE(?)";
        try(Connection connection = connectionFactory.newConnection()){
            try(PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
                statement.setString(1, entity.getName());
                statement.executeUpdate();
                try(ResultSet generatedKeys = statement.getGeneratedKeys()){
                    if( generatedKeys.next()){
                        entity.setId(generatedKeys.getLong(1));
                    }
                }
            }
        }
    }
}
