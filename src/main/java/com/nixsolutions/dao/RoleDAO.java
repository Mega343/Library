package com.nixsolutions.dao;


import com.nixsolutions.bean.Role;

import java.util.List;

public interface RoleDAO {

    public int add(Role role);

    public void edit(Role role);

    public void delete(int id);

    public Role getRole(int id);

    public List<Role> getAllRoles();
}
