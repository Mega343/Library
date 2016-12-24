package com.nixsolutions.main;


import com.nixsolutions.util.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchemaApp {

    private static final Logger LOG = LogManager.getLogger(CreateSchemaApp.class.getName());
    private static Connection connection;
    private static Statement statement;
    private static final String FILE_PROPERTIES = "h2db.properties";


    public static void main(String[] args) throws Exception {
        LOG.traceEntry("Launched the creation of tables.");
        CreateSchemaApp cs = new CreateSchemaApp();
        ReadProperties reader = new ReadProperties();

        try {
            String[] properties = reader.getProperties(FILE_PROPERTIES);
            LOG.info("Open connection to database.");
            connection = DriverManager.getConnection(properties[0], properties[1], properties[2]);
            LOG.info("Connection open successful.");
            statement = connection.createStatement();

            cs.createTableRole(statement);
            cs.createTableCity(statement);
            cs.createTableStreet(statement);
            cs.createTableAddress(statement);
            cs.createTableDocumentType(statement);
            cs.createTableDocument(statement);
            cs.createTableUser(statement);
            cs.createTableLanguage(statement);
            cs.createTableGenre(statement);
            cs.createTablePublishingHouse(statement);
            cs.createTableAuthor(statement);
            cs.createTableShelf(statement);
            cs.createTableOrderType(statement);
            cs.createTableBook(statement);
            cs.createTableOrder(statement);

        } catch (IOException | SQLException  e) {
            LOG.catching(e);
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                    LOG.info("Connection to database closed successful.");
                } catch (SQLException e) {
                    LOG.catching(e);
                }
            }
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    LOG.catching(e);
                }
            }
        }
        LOG.traceExit();
    }

    private void createTableRole(Statement statement) throws SQLException {
        LOG.info("Trying create table role.");
        statement.executeUpdate("CREATE TABLE role (" +
                "role_id INT IDENTITY, " +
                "user_role VARCHAR(30) NOT NULL)");
        LOG.info("Table role created successful.");
    }

    private void createTableCity(Statement statement) throws SQLException {
        LOG.info("Trying create table city.");
        statement.executeUpdate("CREATE TABLE city(" +
                "city_id INT IDENTITY, " +
                "city_name VARCHAR(30) NOT NULL UNIQUE)");
        LOG.info("Table city created successful.");
    }

    private void createTableStreet(Statement statement) throws SQLException {
        LOG.info("Trying create table street.");
        statement.executeUpdate("CREATE TABLE street(" +
                "street_id BIGINT IDENTITY, " +
                "street_name VARCHAR(256) NOT NULL UNIQUE, " +
                "city_id INT NOT NULL, " +
                "FOREIGN KEY (city_id) REFERENCES city (city_id))");
        LOG.info("Table street created successful.");
    }

    private void createTableAddress(Statement statement) throws SQLException {
        LOG.info("Trying create table address.");
        statement.executeUpdate("CREATE TABLE address(" +
                "address_id BIGINT IDENTITY, " +
                "street_id BIGINT NOT NULL, " +
                "house_number VARCHAR(8) NOT NULL, " +
                "flat_number VARCHAR(6) NOT NULL, " +
                "FOREIGN KEY (street_id) REFERENCES street (street_id))");
        LOG.info("Table address created successful.");
    }

    private void createTableDocumentType(Statement statement) throws SQLException {
        LOG.info("Trying create table document_type.");
        statement.executeUpdate("CREATE TABLE document_type(" +
                "document_type_id INT IDENTITY, " +
                "document_type VARCHAR(40) NOT NULL UNIQUE)");
        LOG.info("Table document_type created successful.");
    }

    private void createTableDocument(Statement statement) throws SQLException {
        LOG.info("Trying create table document.");
        statement.executeUpdate("CREATE TABLE document(" +
                "document_id INT IDENTITY, " +
                "document_type_id INT NOT NULL, " +
                "series VARCHAR(3) NOT NULL, " +
                "number INT NOT NULL, " +
                "issued_by VARCHAR(256) NOT NULL, " +
                "date_of_issue DATE NOT NULL, " +
                "document_image CLOB NOT NULL, " +
                "FOREIGN KEY (document_type_id) REFERENCES document_type (document_type_id))");
        LOG.info("Table document created successful.");
    }

    private void createTableUser(Statement statement) throws SQLException {
        LOG.info("Trying create table user.");
        statement.executeUpdate("CREATE TABLE user(" +
                "user_id BIGINT PRIMARY KEY AUTO_INCREMENT, " +
                "first_name VARCHAR(30) NOT NULL, " +
                "last_name VARCHAR(30) NOT NULL, " +
                "email VARCHAR(256) NOT NULL, " +
                "password VARCHAR(30) NOT NULL, " +
                "phone_number VARCHAR(13) NOT NULL UNIQUE, " +
                "karma INT NOT NULL DEFAULT 0, " +
                "document_id INT NOT NULL, " +
                "role_id INT NOT NULL DEFAULT 1, " +
                "address_id INT NOT NULL, " +
                "FOREIGN KEY (document_id) REFERENCES document (document_id), " +
                "FOREIGN KEY (role_id) REFERENCES role (role_id), " +
                "FOREIGN KEY (address_id) REFERENCES address (address_id))");
        LOG.info("Table user created successful.");
    }

    private void createTableLanguage(Statement statement) throws SQLException {
        LOG.info("Trying create table language.");
        statement.executeUpdate("CREATE TABLE language(" +
                "language_id INT IDENTITY, " +
                "language VARCHAR(30) NOT NULL UNIQUE)");
        LOG.info("Table language created successful.");
    }

    private void createTableGenre(Statement statement) throws SQLException {
        LOG.info("Trying create table genre.");
        statement.executeUpdate("CREATE TABLE genre(" +
                "genre_id INT IDENTITY, " +
                "genre VARCHAR(30) NOT NULL UNIQUE)");
        LOG.info("Table genre created successful.");
    }

    private void createTablePublishingHouse(Statement statement) throws SQLException {
        LOG.info("Trying create table publishing_house.");
        statement.executeUpdate("CREATE TABLE publishing_house(" +
                "publishing_house_id INT IDENTITY, " +
                "publishing_house_name VARCHAR(80) NOT NULL UNIQUE)");
        LOG.info("Table publishing_house created successful.");
    }

    private void createTableAuthor(Statement statement) throws SQLException {
        LOG.info("Trying create table author.");
        statement.executeUpdate("CREATE TABLE author(" +
                "author_id INT IDENTITY, " +
                "first_name VARCHAR(30) NOT NULL, " +
                "last_name VARCHAR(30) NOT NULL, " +
                "patronymic VARCHAR(30))");
        LOG.info("Table author created successful.");
    }

    private void createTableShelf(Statement statement) throws SQLException {
        LOG.info("Trying create table shelf.");
        statement.executeUpdate("CREATE TABLE shelf(" +
                "shelf_id INT IDENTITY, " +
                "shelf_number INT NOT NULL UNIQUE)");
        LOG.info("Table shelf created successful.");
    }

    private void createTableOrderType(Statement statement) throws SQLException {
        LOG.info("Trying create table order_type.");
        statement.executeUpdate("CREATE TABLE order_type(" +
                "order_type_id INT IDENTITY, " +
                "order_type VARCHAR(50) NOT NULL UNIQUE)");
        LOG.info("Table order_type created successful.");
    }

    private void createTableBook(Statement statement) throws SQLException {
        LOG.info("Trying create table book.");
        statement.executeUpdate("CREATE TABLE book(" +
                "book_id BIGINT IDENTITY, " +
                "book_name VARCHAR(256) NOT NULL, " +
                "author_id INT NOT NULL, " +
                "publishing_house_id INT NOT NULL, " +
                "genre_id INT NOT NULL, " +
                "year_of_issue INT NOT NULL, " +
                "language_id INT NOT NULL, " +
                "book_description CLOB NOT NULL, " +
                "book_quantity INT NOT NULL, " +
                "book_in_warehouse INT NOT NULL, " +
                "shelf_id INT NOT NULL, " +
                "book_rate INT NOT NULL DEFAULT 0, " +
                "number_of_readings INT NOT NULL DEFAULT 0, " +
                "FOREIGN KEY (author_id) REFERENCES author (author_id), " +
                "FOREIGN KEY (publishing_house_id) REFERENCES publishing_house (publishing_house_id), " +
                "FOREIGN KEY (genre_id) REFERENCES genre (genre_id), " +
                "FOREIGN KEY (language_id) REFERENCES language (language_id), " +
                "FOREIGN KEY (shelf_id) REFERENCES shelf (shelf_id))");
        LOG.info("Table book created successful.");
    }

    private void createTableOrder(Statement statement) throws SQLException {
        LOG.info("Trying create table order.");
        statement.executeUpdate("CREATE TABLE \"ORDER\"(" +
                "order_id BIGINT IDENTITY, " +
                "user_id BIGINT NOT NULL, " +
                "librarian_id BIGINT NOT NULL, " +
                "book_id BIGINT NOT NULL, " +
                "order_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, " +
                "expected_return_date DATE NOT NULL, " +
                "actual_return_date DATE, " +
                "order_type_id INT NOT NULL, " +
                "FOREIGN KEY (user_id) REFERENCES user (user_id), " +
                "FOREIGN KEY (librarian_id) REFERENCES user (user_id), " +
                "FOREIGN KEY (book_id) REFERENCES book (book_id), " +
                "FOREIGN KEY (order_type_id) REFERENCES order_type (order_type_id))");
        LOG.info("Table order created successful.");
    }
}




