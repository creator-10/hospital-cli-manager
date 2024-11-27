package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.AddressDao;
import com.vr.hospitalapp.dto.Address;
import com.vr.hospitalapp.dto.Branch;

public class AddressDaoImp implements AddressDao{

         EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction(); 
    @Override
    public Address saveAddress(int bid, Address address) {
        Branch branch=entityManager.find(Branch.class,bid);
        if(branch!=null){
            entityTransaction.begin();
            entityManager.persist(address);
            entityTransaction.commit();
            return address;
        }
        else{
            return null;
        }
    }

    @Override
    public Address updateAddressById(int aid, Address address) {
      Address address1=entityManager.find(Address.class,aid);
      if(address1!=null){
        address1.setPin(address.getPin());
        address1.setStreet(address.getStreet());
        entityTransaction.begin();
        entityManager.merge(address1);
        entityTransaction.commit();
        return address1;
      }
      else{
        return null;
      }
     
    }

    @Override
    public Address getAddressById(int aid) {
        Address address=entityManager.find(Address.class,aid);
        return address;
    }

    @Override
    public Boolean deleteAddressById(int aid) {
      Address address=entityManager.find(Address.class, aid);
      if(address!=null){
        entityTransaction.begin();
        entityManager.remove(address);
        entityTransaction.commit();
        return true;
      }
      else{
        return false;
      }
    }

    @Override
    public List<Address> getAddressAll() {
       Query query=entityManager.createQuery("select s from Address s");
        List<Address>addresss=query.getResultList();
        return addresss;
    }
   

}
