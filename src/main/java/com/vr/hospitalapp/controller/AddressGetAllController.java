package com.vr.hospitalapp.controller;

import java.util.List;

import com.vr.hospitalapp.dto.Address;
import com.vr.hospitalapp.service.AddressService;

public class AddressGetAllController {
    public static void main(String[]args){
        AddressService addressService=new AddressService();
        List<Address>address=addressService.getAddressAll();
        for (Address address1 : address) {
            System.out.println(address1.getAid());
            System.out.println(address1.getStreet());
            System.out.println(address1.getCountry());
            System.out.println(address1.getPin());
            System.out.println(address1.getBranchs());
            System.out.println("______________________");
        }
    }
}
