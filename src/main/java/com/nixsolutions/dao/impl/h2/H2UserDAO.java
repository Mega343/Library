package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.User;
import com.nixsolutions.dao.UserDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class H2UserDAO implements UserDAO {

    private static final Logger LOG = LogManager.getLogger(H2UserDAO.class.getName());
    private PreparedStatement statement;

    @Override
    public int add(User user) {
        LOG.traceEntry("Launched adding user to database " + user.toString());
        int result = -1;
        try(Connection connection = H2DAOFactory.getConnection()) {

            statement = connection.prepareStatement("INSERT INTO user " +
                    "(first_name, last_name, email, password, phone_number, karma, document_id, role_id, address_id) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ? )");
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getPhoneNumber());
            statement.setInt(6, user.getKarma());
            statement.setInt(7, user.getDocumentID());
            statement.setInt(8, user.getRoleID());
            statement.setInt(9, user.getAddressID());
            result = statement.executeUpdate();

        } catch (Exception e) {
            LOG.catching(e);
            e.printStackTrace();
        }
        LOG.traceExit("User add with code result " + result);
        return result;
    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(Long id) {
        LOG.traceEntry("Launched deleting user from database with id = " + id);
        try(Connection connection = H2DAOFactory.getConnection()) {

            statement = connection.prepareStatement("DELETE FROM user WHERE user_id=?");
            statement.setLong(1, id);
            statement.executeUpdate();

        } catch (Exception e) {
            LOG.catching(e);
            e.printStackTrace();
        }
        LOG.traceExit("User deleted from database.");
    }

    @Override
    public User getUser(Long id) {
        User user = new User();
        LOG.traceEntry("Launched find user by id = " + id);
        try(Connection connection = H2DAOFactory.getConnection()) {

            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery("SELECT * FROM user WHERE user_id=" + id);
            while (set.next()) {
                user.setUserID(set.getLong("user_id"));
                user.setFirstName(set.getString("first_name"));
                user.setLastName(set.getString("last_name"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setPhoneNumber(set.getString("phone_number"));
                user.setKarma(set.getInt("karma"));
                user.setDocumentID(set.getInt("document_id"));
                user.setRoleID(set.getInt("role_id"));
                user.setAddressID(set.getInt("address_id"));
            }

        } catch (Exception e) {
            LOG.catching(e);
            e.printStackTrace();
        }
        LOG.traceExit("User deleted from database.");
        return user;
    }

    @Override
    public List<User> searchByFirstName(String firstName) {
        return null;
    }

    @Override
    public User searchByEmail(String email) {
        User user = new User();
        LOG.traceEntry("Launched find user by email = " + email);
        try(Connection connection = H2DAOFactory.getConnection()) {

            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery("SELECT * FROM user WHERE email=" + email);
            while (set.next()) {
                user.setUserID(set.getLong("user_id"));
                user.setFirstName(set.getString("first_name"));
                user.setLastName(set.getString("last_name"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setPhoneNumber(set.getString("phone_number"));
                user.setKarma(set.getInt("karma"));
                user.setDocumentID(set.getInt("document_id"));
                user.setRoleID(set.getInt("role_id"));
                user.setAddressID(set.getInt("address_id"));
            }

        } catch (Exception e) {
            LOG.catching(e);
            e.printStackTrace();
        }
        LOG.traceExit("User deleted from database.");
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }


}
