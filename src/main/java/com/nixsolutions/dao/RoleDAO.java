package com.nixsolutions.dao;


import com.nixsolutions.bean.Role;

import java.util.List;

public interface RoleDAO {

    public int add(Role role);

    public void edit(Role role);

    public void delete(Integer id);

    public Role getRole(Integer id);

    public List<Role> getAllRoles();
}
