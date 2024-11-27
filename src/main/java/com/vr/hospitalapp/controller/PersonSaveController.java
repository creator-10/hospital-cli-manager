package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Person;
import com.vr.hospitalapp.service.PersonService;


public class PersonSaveController {
    public static void main(String[] args) {
        PersonService personService=new PersonService();
        Person person=new Person();
        person.setName("Mannesh");
        person.setAge(26);
        personService.savePersonService(1,person);
    }
        
}
