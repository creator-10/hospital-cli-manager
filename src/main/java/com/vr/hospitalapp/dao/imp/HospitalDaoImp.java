package com.vr.hospitalapp.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vr.hospitalapp.dao.HospitalDao;
import com.vr.hospitalapp.dto.Hospital;

public class HospitalDaoImp implements HospitalDao{

    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

    @Override
    public Hospital SaveHospital(Hospital hospital) {
                entityTransaction.begin();
                entityManager.persist(hospital);
                entityTransaction.commit();
                return hospital;
    }

    @Override
    public Hospital getHospitalById(int id) {
            Hospital hospital=entityManager.find(Hospital.class, id);
            return hospital;
    }

    @Override
    public Boolean DeleteHospitalById(int id) {
        // TODO Auto-generated method stub
        Hospital hospital=entityManager.find(Hospital.class, id);
        if(hospital!=null){
            entityTransaction.begin();
            entityManager.remove(hospital);
            entityTransaction.commit();
                return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public Hospital UpdateHospitalById(int id, Hospital hospital) {
        Hospital hospital1=entityManager.find(Hospital.class, id);
        if(hospital1!=null){
            hospital1.setName(hospital.getName());
            hospital1.setWebsite(hospital.getWebsite());
            entityTransaction.begin();
            entityManager.merge(hospital1);
            entityTransaction.commit();
            return hospital1;

        }

       else{
        return null;
       }
    }

        
}
