package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.BranchDao;
import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.dto.Hospital;

public class BranchDaoimp  implements BranchDao{

       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction(); 
    @Override
    public Branch saveBranch(int hid, Branch branch) {
        Hospital hospital=entityManager.find(Hospital.class,hid);
            if(hospital!=null){
                branch.setHospital(hospital);
                entityTransaction.begin();
                entityManager.persist(branch);
                entityTransaction.commit();
                return branch;
            }
        else{
            return null;
        }
    }

    @Override
    public Branch getBranchById(int bid) {
        Branch branch=entityManager.find(Branch.class, bid);
        return branch;
    }

    @Override
    public Boolean DeleteBranchById(int hid, int bid) {
        Hospital hospital=entityManager.find(Hospital.class,hid);
        if(hospital!=null){
            Branch branch=entityManager.find(Branch.class,bid);
            entityTransaction.begin();
            entityManager.remove(branch);
            entityTransaction.commit();
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Branch updateBranchById(int bid, Branch branch) {
        Branch branch1=entityManager.find(Branch.class, bid);
        if(branch1!=null){
                branch1.setName(branch.getName());
                branch1.setPhone(branch.getPhone());
            entityTransaction.begin();
            entityManager.merge(branch1);
            entityTransaction.commit();
            return branch1;
        }
       else{
        return null;
       }
    }

    @Override
    public List<Branch> getAllBranch() {
    Query query=entityManager.createQuery("select s from Branch s");
    List<Branch>branchs=query.getResultList();
    return branchs;
    }
       

}
