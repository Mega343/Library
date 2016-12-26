package com.nixsolutions.dao.impl.h2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.h2.jdbcx.JdbcConnectionPool;

import java.sql.Connection;

public class H2ConnectionManager {

    private static volatile JdbcConnectionPool connectionPool;
    private static final Logger LOG = LogManager.getLogger(H2ConnectionManager.class.getName());
    private static final int CONNECTION_PULL_SIZE = 10;
    private static final int LOGIN_TIMEOUT = 100;

    private H2ConnectionManager() {
    }

    public static Connection getConnection(String url, String login, String password) throws Exception {
        if (connectionPool == null) {
            LOG.info("Connection pull is null.");
            synchronized (H2ConnectionManager.class) {
                if (connectionPool == null) {
                    connectionPool = JdbcConnectionPool.create(url, login, password);
                    connectionPool.setMaxConnections(CONNECTION_PULL_SIZE);
                    connectionPool.setLoginTimeout(LOGIN_TIMEOUT);
                    LOG.info("Connection pull was initialized.");
                }
            }
        }
        LOG.info("Connection return. Active connections: " + connectionPool.getActiveConnections());
        return connectionPool.getConnection();
    }
}
