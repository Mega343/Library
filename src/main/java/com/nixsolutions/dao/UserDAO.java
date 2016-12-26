package com.nixsolutions.dao;

import com.nixsolutions.bean.User;

import java.util.List;

public interface UserDAO {

    public int add(User user);

    public void edit(User user);

    public void delete(Long id);

    public User getUser(Long id);

    public List<User> searchByFirstName(String firstName);

    public User searchByEmail(String email);

    public List<User> getAllUsers();

}
