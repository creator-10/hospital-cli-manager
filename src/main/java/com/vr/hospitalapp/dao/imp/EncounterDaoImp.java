package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.EncounterDao;
import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.dto.Encounter;

public class EncounterDaoImp implements EncounterDao{
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
    
        @Override
    public Encounter saveEncounter(int bid, Encounter encounter) {
        Branch branch=entityManager.find(Branch.class,bid);
        if(branch!=null){
            entityTransaction.begin();
            entityManager.persist(encounter);
            entityTransaction.commit();
            return encounter;
        }
        else{
            return null;
        }
    }

    @Override
    public Encounter updateEncounterById(int eid, Encounter encounter) {
       Encounter encounter1=entityManager.find(Encounter.class, eid);
       if(encounter1!=null){
        encounter1.setDateofjoin(encounter.getDatofjoin());
        encounter1.setDateofdischarge(encounter.getDateofdischarge());
        entityTransaction.begin();
        entityManager.merge(encounter1);
        entityTransaction.commit();
        return encounter1;
       }
       else{
        return null;
       }
    }
    

    @Override
    public Encounter getEncounterById(int eid) {
        Encounter encounter=entityManager.find(Encounter.class, eid);
        return encounter;
    }

    @Override
    public Boolean deleteEncounterById(int eid) {
       Encounter encounter=entityManager.find(Encounter.class, eid);
            if(encounter!=null){
       entityTransaction.begin();
       entityManager.remove(encounter);
       entityTransaction.commit();
       return true;
            }
        else{
            return false;
        }
    }

    @Override
    public List<Encounter> getAllEncounter() {
       Query query=entityManager.createQuery("select s from Encounter s");
           List<Encounter>encounters =query.getResultList();
           return encounters;
    }

}
