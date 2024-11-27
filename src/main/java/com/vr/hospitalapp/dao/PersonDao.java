package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.Person;

public interface PersonDao {

        public Person savePerson(int eid,Person person);

        public Person updatePersonById(int pid,Person person);

        public Person getPersonById(int pid);

        public Boolean deletePersonById(int pid);

        public List<Person>getAllperson();

        public List<Person> getPersonByGender(String gender);

        public List<Person> getPersonByAge(int age);

        public List<Person> getPersonByPhone(long phone);
}
