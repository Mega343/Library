package com.nixsolutions.main;

import com.nixsolutions.bean.User;
import com.nixsolutions.dao.DAOFactory;
import com.nixsolutions.dao.UserDAO;


public class UserManagementApp {

    public static void main(String[] args) {

        User user = new User();
        user.setFirstName("Max");
        user.setLastName("Kolov");
        user.setEmail("ivanov123@mail.ru");
        user.setPassword("qwerty");
        user.setPhoneNumber("+380932728785");
        user.setKarma(5);
        user.setDocumentID(1);
        user.setRoleID(1);
        user.setAddressID(1);

        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.H2);
        UserDAO userDAO = factory.getUserDAO();
     //   userDAO.add(user);
      //  userDAO.delete(8L);
       user =  userDAO.getUser(3L);
        System.out.println(user.toString());
    }
}
