package com.nixsolutions.dao;

import com.nixsolutions.bean.User;

import java.util.List;

public interface UserDAO {

    public int add(User user);

    public void edit(User user);

    public void delete(int id);

    public User getUser(int id);

    public List<User> searchByFirstName(String firstName);

    public User searchByEmail(User user);

    public List<User> getAllUsers();

}
