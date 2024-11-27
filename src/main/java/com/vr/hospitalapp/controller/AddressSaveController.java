package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Address;

import com.vr.hospitalapp.service.AddressService;

public class AddressSaveController {
public static void main(String[]args){
    AddressService addressService=new AddressService();
    Address address=new Address();
    address.setStreet("pattam");
    address.setCountry("India");
    address.setPin(657937);
    
    address.setStreet("Kalamassery");
    address.setCountry("India");
    address.setPin(657459);
    addressService.saveAddress(1,address);
    
  }
}
