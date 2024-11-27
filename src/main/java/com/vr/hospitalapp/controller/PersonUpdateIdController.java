package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Person;
import com.vr.hospitalapp.service.PersonService;

public class PersonUpdateIdController {
    public static void main(String[]args){
        PersonService personService=new PersonService();
            Person person=new Person();
            person.setName("Jack");
            person.setAge(23);
            personService.updatePersonByIdService(2, person);
    }
}                  
