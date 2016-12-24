package com.nixsolutions.main;


import com.nixsolutions.dao.impl.h2.H2ConnectionManager;
import com.nixsolutions.util.ReadProperties;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main implements Runnable {
    private static String fileProperties = "h2db.properties";
    static Statement statement;
    static Connection connection;


    public static void main(String[] args) throws Exception {

        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();
        new Thread(new Main()).start();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start work");
        try {
            ReadProperties reader = new ReadProperties();
            String[] properties = reader.getProperties(fileProperties);
            connection = H2ConnectionManager.getConnection(properties[0], properties[1], properties[2]);
            statement = connection.createStatement();
            statement.execute("INSERT INTO role (user_role) VALUES ('Reader')");
            System.out.println(Thread.currentThread().getName() + " end work");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {

                }
            } if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {

                }
            }
        }

    }
}
