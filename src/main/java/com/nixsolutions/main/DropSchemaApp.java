package com.nixsolutions.main;

import com.nixsolutions.util.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropSchemaApp {

    private static final Logger LOG = LogManager.getLogger(DropSchemaApp.class.getName());
    private static Connection connection;
    private static Statement statement;
    private static final String FILE_PROPERTIES = "h2db.properties";

    public static void main(String[] args) {
        LOG.traceEntry("Launched drop tables.");
        ReadProperties reader = new ReadProperties();
        DropSchemaApp ds = new DropSchemaApp();

        try {
            String[] properties = reader.getProperties(FILE_PROPERTIES);
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(properties[0], properties[1], properties[2]);
            statement = connection.createStatement();

            ds.dropTableRole(statement);
            ds.dropTableAddress(statement);
            ds.dropTableAuthor(statement);
            ds.dropTableBook(statement);
            ds.dropTableCity(statement);
            ds.dropTableDocument(statement);
            ds.dropTableDocumentType(statement);
            ds.dropTableGenre(statement);
            ds.dropTableLanguage(statement);
            ds.dropTableOrder(statement);
            ds.dropTableOrderType(statement);
            ds.dropTablePublishingHouse(statement);
            ds.dropTableShelf(statement);
            ds.dropTableStreet(statement);
            ds.dropTableUser(statement);

        } catch (IOException | SQLException e) {
            LOG.catching(e);
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    LOG.info("Connection to database closed successful.");
                } catch (SQLException e) {
                    LOG.catching(e);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    LOG.catching(e);
                }
            }
        }
        LOG.traceExit();
    }

    private void dropTableRole(Statement statement) throws Exception {
        LOG.info("Trying drop table role.");
        statement.execute("DROP TABLE role");
        LOG.info("Table role dropped successful");
    }

    private void dropTableCity(Statement statement) throws Exception {
        LOG.info("Trying drop table city.");
        statement.execute("DROP TABLE city");
        LOG.info("Table city dropped successful");
    }

    private void dropTableStreet(Statement statement) throws Exception {
        LOG.info("Trying drop table street.");
        statement.execute("DROP TABLE street");
        LOG.info("Table street dropped successful");
    }

    private void dropTableAddress(Statement statement) throws Exception {
        LOG.info("Trying drop table address.");
        statement.execute("DROP TABLE address");
        LOG.info("Table address dropped successful");
    }

    private void dropTableDocumentType(Statement statement) throws Exception {
        LOG.info("Trying drop table document_type.");
        statement.execute("DROP TABLE document_type");
        LOG.info("Table document_type dropped successful");
    }

    private void dropTableDocument(Statement statement) throws Exception {
        LOG.info("Trying drop table document.");
        statement.execute("DROP TABLE document");
        LOG.info("Table document dropped successful");
    }

    private void dropTableUser(Statement statement) throws Exception {
        LOG.info("Trying drop table user.");
        statement.execute("DROP TABLE user");
        LOG.info("Table user dropped successful");
    }

    private void dropTableLanguage(Statement statement) throws Exception {
        LOG.info("Trying drop table language.");
        statement.execute("DROP TABLE language");
        LOG.info("Table language dropped successful");
    }

    private void dropTableGenre(Statement statement) throws Exception {
        LOG.info("Trying drop table genre.");
        statement.execute("DROP TABLE genre");
        LOG.info("Table genre dropped successful");
    }

    private void dropTablePublishingHouse(Statement statement) throws Exception {
        LOG.info("Trying drop table publishing_house.");
        statement.execute("DROP TABLE publishing_house");
        LOG.info("Table publishing_house dropped successful");
    }

    private void dropTableAuthor(Statement statement) throws Exception {
        LOG.info("Trying drop table author.");
        statement.execute("DROP TABLE author");
        LOG.info("Table author dropped successful");
    }

    private void dropTableShelf(Statement statement) throws Exception {
        LOG.info("Trying drop table shelf.");
        statement.execute("DROP TABLE shelf");
        LOG.info("Table shelf dropped successful");
    }

    private void dropTableOrderType(Statement statement) throws Exception {
        LOG.info("Trying drop table order_type.");
        statement.execute("DROP TABLE order_type");
        LOG.info("Table order_type dropped successful");
    }

    private void dropTableBook(Statement statement) throws Exception {
        LOG.info("Trying drop table book.");
        statement.execute("DROP TABLE book");
        LOG.info("Table book dropped successful");
    }

    private void dropTableOrder(Statement statement) throws Exception {
        LOG.info("Trying drop table order.");
        statement.execute("DROP TABLE \"ORDER\"");
        LOG.info("Table order dropped successful");
    }

    private void dropAllObjects(Statement statement) throws Exception {
        LOG.info("Trying drop all objects");
        statement.execute("DROP ALL OBJECTS");
        LOG.info("All objects drop successful");
    }

}
