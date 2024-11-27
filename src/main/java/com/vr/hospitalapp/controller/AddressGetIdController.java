package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Address;
import com.vr.hospitalapp.service.AddressService;

public class AddressGetIdController {
    public static void main(String[]args){
        AddressService addressService=new AddressService();
        Address address=addressService.getAddressById(2);
        System.out.println(address.getAid());
        System.out.println(address.getCountry());
        System.out.println(address.getPin());
        System.out.println(address.getStreet());
        
    }
}
