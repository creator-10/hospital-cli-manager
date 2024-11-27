package com.vr.hospitalapp.controller;
import com.vr.hospitalapp.service.ItemService;

public class ItemDeleteController {
    public static void main(String[]args){
         ItemService itemService=new ItemService();
       itemService.deleteItemByIdService(2);
    }
}
