package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.User;
import com.nixsolutions.dao.UserDAO;

import java.util.List;

public class H2UserDAO implements UserDAO {
    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> searchByFirstName(String firstName) {
        return null;
    }

    @Override
    public User searchByEmail(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
