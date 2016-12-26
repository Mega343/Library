package com.nixsolutions.dao;

import com.nixsolutions.dao.impl.h2.H2DAOFactory;

public abstract class DAOFactory {

    public static final int H2 = 1;

    public abstract AddressDAO getAddressDAO();

    public abstract AuthorDAO getAuthorDAO();

    public abstract BookDAO getBookDAO();

    public abstract CityDAO getCityDAO();

    public abstract DocumentDAO getDocumentDAO();

    public abstract DocumentTypeDAO getDocumentTypeDAO();

    public abstract GenreDAO getGenreDAO();

    public abstract LanguageDAO getLanguageDAO();

    public abstract OrderTypeDAO getOrderTypeDAO();

    public abstract OrderDAO getOrderDAO();

    public abstract PublishingHouseDAO getPublishingHouseDAO();

    public abstract RoleDAO getRoleDAO();

    public abstract ShelfDAO getShelfDAO();

    public abstract StreetDAO getStreetDAO();

    public abstract UserDAO getUserDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case H2:
                return new H2DAOFactory();
            default:
                return null;
        }
    }
}
