package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.UserDao;

import com.vr.hospitalapp.dto.User;

public class UserDaoimp implements UserDao {

             EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction(); 


    @Override
    public User saveUser(User user) {
       entityTransaction.begin();
       entityManager.persist(user);
       entityTransaction.commit();
       return user;
    }

    @Override
    public User getUserById(int uid) {
            User user=entityManager.find(User.class, uid);
            return user;

    }

    @Override
    public boolean deleteUserid(int uid) {
      
        User user=entityManager.find(User.class, uid);
        if(user!=null){
            entityTransaction.begin();
            entityManager.remove(user);
            entityTransaction.commit();
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public User updateUserId(int uid, User user) {
      User user1=entityManager.find(User.class, uid);

        if(user1!=null){
            user1.setName(user.getName());
            user1.setEmail(user.getEmail());

            entityTransaction.begin();
            entityManager.merge(user1);
            entityTransaction.commit();
            return user1;
        }
       else{
        return null;
       }
    }

    @Override
    public List<User> getAlluser() {
      
    Query query=entityManager.createQuery("select s from User s");
    List<User>user=query.getResultList();
    return user;
    }

    @Override
    public List<User> getUserByRole(String role) {
        Query query=entityManager.createQuery("select s from Branch s where role=?1");
        query.setParameter(1, role);
        List<User>user=query.getResultList();
       
        return user;
    }
    

}
