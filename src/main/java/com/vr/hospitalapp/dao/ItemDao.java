package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.Item;

public interface ItemDao {
        Item saveItem(int mid, Item item);

        Item getItemById(int iid);

        Item updateItemById(int iid,Item item);

        Boolean deleteItemById(int iid);

        List<Item> getAllItems();

}
