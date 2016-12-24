package com.nixsolutions.bean;

public class Role {

    private Integer roleID;
    private String userRole;

    public Role(Integer roleID, String userRole) {
        this.roleID = roleID;
        this.userRole = userRole;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
