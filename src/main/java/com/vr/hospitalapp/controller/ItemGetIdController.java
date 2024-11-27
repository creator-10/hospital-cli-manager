package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Item;
import com.vr.hospitalapp.service.ItemService;

public class ItemGetIdController {
     public static void main(String[]args){  
        ItemService itemService=new ItemService();
       Item item =itemService.getItemByIdService(3);
        System.out.println(item.getIid());
        System.out.println(item.getItemName());
        System.out.println(item.getQuantity());
        System.out.println(item.getCost());
        System.out.println("________________________________");
}
}