package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Item;
import com.vr.hospitalapp.service.ItemService;

public class ItemSaveController {
   
    public static void main(String[] args) {
    ItemService itemService=new ItemService();
    Item item=new Item();
      
    item.setItemName("paracetamol");
    item.setQuantity(3);
    item.setCost(100);

    item.setItemName("Rantack");
    item.setQuantity(3);
    item.setCost(160);
     
    itemService.saveItemService(1,item);
    
}

}
