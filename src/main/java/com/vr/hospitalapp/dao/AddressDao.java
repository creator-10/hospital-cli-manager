package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.Address;

public interface AddressDao {

            public Address saveAddress(int bid,Address address);
 
            public Address updateAddressById(int aid,Address address);
 
            public Address  getAddressById(int aid);

            public Boolean deleteAddressById(int aid);

            public List<Address> getAddressAll();
}
