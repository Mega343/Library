package com.nixsolutions.dao;

import com.nixsolutions.bean.Address;

public interface AddressDAO {

    public int add(Address address);

    public void edit(Address address);

    public void delete(Integer id);

    public Address getAddress(Integer id);

}
