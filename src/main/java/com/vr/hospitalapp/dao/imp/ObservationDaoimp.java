package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.ObservationDao;
import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.dto.Observation;

public class ObservationDaoimp implements ObservationDao{

 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        @Override
        public Observation saveObservation(int bid, Observation observation) {
                Branch branch=entityManager.find(Branch.class, bid);
                if(branch!=null){
                    entityTransaction.begin();
                    entityManager.persist(observation);
                    entityTransaction.commit();
                    return observation;
                }
            else {
                return null;
            }
        }

        @Override
        public Observation updateObservationById(int oid, Observation observation) {
             Observation observation1 =entityManager.find(Observation.class, oid);
             if(observation1!=null){
             observation1.setDname(observation.getDname());
             observation1.setEncounters(observation.getEncounters());
             entityTransaction.begin();
             entityManager.merge(observation1);
             entityTransaction.commit();
             return observation1;
        }
        else{
            return null;
        }
        }
        @Override
        public Observation getObservationById(int oid) {
            Observation observation=entityManager.find(Observation.class, oid);
            return observation;
        }
        @Override
        public Boolean deleteObservationById(int oid) {
            Observation observation=entityManager.find(Observation.class, oid);
            if(observation!=null){
                    entityTransaction.begin();
                    entityManager.remove(observation);
                    entityTransaction.commit();
                return true;
            }
            else{
                return false;
            }
        }
        @Override
        public List<Observation> getAllObservation() {
            Query query=entityManager.createQuery("select s from Observation s");
               List<Observation>observations=query.getResultList(); 
               return observations;
        }
        @Override
        public List<Observation> getObservationsByDoctorName(String name) {
          Query query=entityManager.createQuery("select s from Observation s where dname=?1");
          query.setParameter(1,name);
          List<Observation>observations=query.getResultList();
          return observations;
        }


}
