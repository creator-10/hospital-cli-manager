package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.vr.hospitalapp.dao.medOrderDao;
import com.vr.hospitalapp.dto.Encounter;
import com.vr.hospitalapp.dto.MedOrder;

public class medOrderDaoimp implements medOrderDao{
      EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
      EntityManager entityManager=entityManagerFactory.createEntityManager();
      EntityTransaction entityTransaction=entityManager.getTransaction();
    
      @Override
    public MedOrder saveMedOrder(int eid, MedOrder medOrder) {
        Encounter encounter=entityManager.find(Encounter.class, eid);
        if(encounter!=null){
            entityTransaction.begin();
            entityManager.persist(medOrder);
            entityTransaction.commit();
            return medOrder;
        }
        else{
            return null;
        }
    }
    @Override
    public MedOrder getMedOrderById(int mid) {
           MedOrder medOrder =entityManager.find(MedOrder.class, mid);
            return medOrder;
    }
    @Override
    public MedOrder updateMedOrderById(int mid, MedOrder medOrder) {

           MedOrder medOrder1=entityManager.find(MedOrder.class, medOrder);
           if(medOrder1!=null){
           medOrder1.setDname(medOrder.getDname());
           medOrder1.setEncounters(medOrder.getEncounters());
            entityTransaction.begin();
            entityManager.merge(medOrder1);
            entityTransaction.commit();
           return medOrder1;
           }
           return null;
    }
    @Override
    public Boolean deleteMedOrderById(int mid) {
        MedOrder medOrder=entityManager.find(MedOrder.class, mid);
        if(medOrder!=null){
            entityTransaction.begin();
            entityManager.remove(medOrder);
            entityTransaction.commit();
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public List<MedOrder> getAllMedOrder() {
     Query query=entityManager.createQuery("select s from MedOrder s");
           List<MedOrder>medOrders =query.getResultList();
          return medOrders;
          
    }
    @Override
    public List<MedOrder> getAllMedOrderBYDoctorName(String name) {
        Query query=entityManager.createQuery("select s from MedOrder s where dname=?1");
        query.setParameter(1,name);
        List <MedOrder> medOrder=query.getResultList();
        return medOrder;
    }


}
