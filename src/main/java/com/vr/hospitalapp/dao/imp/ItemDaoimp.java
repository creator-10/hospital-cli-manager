package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.ItemDao;
import com.vr.hospitalapp.dto.Item;
import com.vr.hospitalapp.dto.MedOrder;

public class ItemDaoimp implements ItemDao {

     EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
     EntityManager entityManager=entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction=entityManager.getTransaction();
    
     @Override
    public Item saveItem(int mid, Item item) {
        MedOrder medOrder=entityManager.find(MedOrder.class, mid);
            if(medOrder!=null){
                entityTransaction.begin();
                entityManager.persist(item);
                entityTransaction.commit();
                return item;
            }
            else{
                return null;
            }

    }

    @Override
    public Item getItemById(int iid) {
        Item item=entityManager.find(Item.class,iid);
        return item;
    }

    @Override
    public Item updateItemById(int iid, Item item) {
        Item item1=entityManager.find(Item.class,iid);
        if(item1!=null){
        entityTransaction.begin();
        entityManager.merge(item);
        entityTransaction.commit();
        return item1;
        }
        else{
            return null;
        }
    }

    @Override
    public Boolean deleteItemById(int iid) {
            Item item=entityManager.find(Item.class, iid);
            if(item!=null){
                    entityTransaction.begin();
                    entityManager.remove(item);
                    entityTransaction.commit();
            return true;
            }
            else{
                return false;
            }
          
    }   

    @Override
    public List<Item> getAllItems(){
           Query query=entityManager.createQuery("select s from Item s");
               List<Item>items=query.getResultList();
               return items;
    }

}
