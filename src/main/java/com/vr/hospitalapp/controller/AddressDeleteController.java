package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.service.AddressService;

public class AddressDeleteController {
    public static void main(String[] args) {
        AddressService addressService=new AddressService();
        addressService.deleteAddressById(1);
    }
   
}
