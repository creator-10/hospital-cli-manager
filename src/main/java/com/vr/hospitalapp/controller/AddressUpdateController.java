package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Address;
import com.vr.hospitalapp.service.AddressService;

public class AddressUpdateController {
    public static void main(String[] args) {
        AddressService addressService=new AddressService();
        Address address=new Address();
            address.setPin(689456);
            address.setStreet("Vallarpadam");
        addressService.updateAddressById(2, address);
    }
        
}
