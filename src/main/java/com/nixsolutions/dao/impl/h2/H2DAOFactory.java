package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.dao.*;
import com.nixsolutions.util.ReadProperties;

import java.sql.Connection;

public class H2DAOFactory extends DAOFactory {

    private static final String FILE_PROPERTIES = "h2db.properties";

    public static Connection getConnection() throws Exception {
        String[] properties = new ReadProperties().getProperties(FILE_PROPERTIES);
        return H2ConnectionManager.getConnection(properties[0], properties[1], properties[2]);
    }

    @Override
    public AddressDAO getAddressDAO() {
        return new H2AddressDAO();
    }

    @Override
    public AuthorDAO getAuthorDAO() {
        return new H2AuthorDAO();
    }

    @Override
    public BookDAO getBookDAO() {
        return new H2BookDAO();
    }

    @Override
    public CityDAO getCityDAO() {
        return new H2CityDAO();
    }

    @Override
    public DocumentDAO getDocumentDAO() {
        return new H2DocumentDAO();
    }

    @Override
    public DocumentTypeDAO getDocumentTypeDAO() {
        return new H2DocumentTypeDAO();
    }

    @Override
    public GenreDAO getGenreDAO() {
        return new H2GenreDAO();
    }

    @Override
    public LanguageDAO getLanguageDAO() {
        return new H2LanguageDAO();
    }

    @Override
    public OrderTypeDAO getOrderTypeDAO() {
        return new H2OrderTypeDAO();
    }

    @Override
    public OrderDAO getOrderDAO() {
        return new H2OrderDAO();
    }

    @Override
    public PublishingHouseDAO getPublishingHouseDAO() {
        return new H2PublishingHouseDAO();
    }

    @Override
    public RoleDAO getRoleDAO() {
        return new H2RoleDAO();
    }

    @Override
    public ShelfDAO getShelfDAO() {
        return new H2ShelfDAO();
    }

    @Override
    public StreetDAO getStreetDAO() {
        return new H2StreetDAO();
    }

    @Override
    public UserDAO getUserDAO() {
        return new H2UserDAO();
    }
}
