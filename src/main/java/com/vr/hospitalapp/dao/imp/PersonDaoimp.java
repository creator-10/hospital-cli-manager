package com.vr.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.vr.hospitalapp.dao.PersonDao;

import com.vr.hospitalapp.dto.Encounter;
import com.vr.hospitalapp.dto.Person;

public class PersonDaoimp implements PersonDao{
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction(); 
    @Override
    public Person savePerson(int eid, Person person) {
       Encounter encounter=entityManager.find(Encounter.class, eid);
       if(encounter!=null){
            entityTransaction.begin();
            entityManager.persist(person);
            entityTransaction.commit();
        return person;
       }
       else{
            return null;
       } 
    }

    @Override
    public Person updatePersonById(int pid, Person person) {
        Person person1=entityManager.find(Person.class, pid);

        if(person1!=null){
            person1.setName(person.getName());
            person1.setEmail(person.getEmail());

            entityTransaction.begin();
            entityManager.merge(person1);
            entityTransaction.commit();
            return person1;
        }
       else{
        return null;
       }
    }

    @Override
    public Person getPersonById(int pid) {
        
        Person person=entityManager.find(Person.class, pid);
        return person;
    }

    @Override
    public Boolean deletePersonById(int pid) {
        Person person=entityManager.find(Person.class, pid);
        if(person!=null){
            entityTransaction.begin();
            entityManager.remove(person);
            entityTransaction.commit();
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public List<Person> getAllperson() {
       Query query=entityManager.createQuery("select s from Person s");
    List<Person>person=query.getResultList();
    return person;
    }

    @Override
    public List<Person> getPersonByGender(String gender) {
        Query query=entityManager.createQuery("select s from Branch s where gender=?1");
        query.setParameter(1, gender);
        List<Person>persons=query.getResultList();
        return persons;
    }

    @Override
    public List<Person> getPersonByAge(int age) {
        Query query=entityManager.createQuery("select s from Branch s where age=?1");
        query.setParameter(1, age);
        List<Person>persons=query.getResultList();
       
        return persons;
    }

    @Override
    public List<Person> getPersonByPhone(long phone) {
        Query query=entityManager.createQuery("select s from Branch s where phone=?1");
        query.setParameter(1, phone);
        List<Person>persons=query.getResultList();
       
        return persons;
    }

}
