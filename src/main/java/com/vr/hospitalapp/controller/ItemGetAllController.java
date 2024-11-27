package com.vr.hospitalapp.controller;

import java.util.List;

import com.vr.hospitalapp.dto.Item;
import com.vr.hospitalapp.service.ItemService;

public class ItemGetAllController {
        public static void main(String[]args){
    ItemService itemService=new ItemService();
        List<Item>item=itemService.getAllItemsService();
        for (Item item1 : item) {
            System.out.println(item1.getIid());
            System.out.println(item1.getItemName());
            System.out.println(item1.getQuantity());
            System.out.println(item1.getCost());
            System.out.println("______________________________");
        }
    }
}
