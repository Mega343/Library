package com.nixsolutions.dao;

import com.nixsolutions.bean.Address;

public interface AddressDAO {

    public int add(Address address);

    public void edit(Address address);

    public void delete(int id);

    public Address getAddress(int id);

}
