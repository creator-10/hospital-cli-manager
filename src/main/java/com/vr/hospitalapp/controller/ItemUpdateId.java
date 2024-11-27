package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Item;
import com.vr.hospitalapp.service.ItemService;

public class ItemUpdateId {
    public static void main(String[] args) {
         ItemService itemService=new ItemService();
            Item item=new Item();
            item.setItemName(null);
            item.setQuantity(0);
            itemService.updateItemByIdService(1,item);
    }
}

