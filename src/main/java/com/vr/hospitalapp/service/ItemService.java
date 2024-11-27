package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.ItemDao;
import com.vr.hospitalapp.dao.imp.ItemDaoimp;
import com.vr.hospitalapp.dto.Item;

public class ItemService {
    public void saveItemService(int mid,Item item){
            ItemDaoimp daoimp=new ItemDaoimp();
          Item item1=daoimp.saveItem(mid, item);
            
          if(item1!=null){
            System.out.println("Data Saved");
          }
          else{
            System.out.println("Data not Saved");
          }
    }

    public void deleteItemByIdService(int iid){
        ItemDaoimp daoimp=new ItemDaoimp();
        Boolean flag=daoimp.deleteItemById(iid);

            if(flag){
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data not Deleted");
            }
    }

    public Item updateItemByIdService(int iid,Item item){
            ItemDaoimp daoimp=new ItemDaoimp();
           Item item1=daoimp.updateItemById(iid,item);

           if(item1!=null){
                return item1;
           }
           else{
            return null;
           }
    }

    
    public Item getItemByIdService(int iid){
            ItemDaoimp daoimp=new ItemDaoimp();
            Item item1=daoimp.getItemById(iid);
            if(item1!=null){
                return item1;
            }
            else{
                return null;
            }
    }

    public List<Item> getAllItemsService(){
            ItemDaoimp daoimp=new ItemDaoimp();
            List<Item>item1=daoimp.getAllItems();
            if(item1!=null){
                return item1;
            }
            
            else{
                return null;
            }
    }

}
