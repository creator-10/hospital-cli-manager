package com.vr.hospitalapp.controller;
import com.vr.hospitalapp.service.PersonService;

public class PersonDeleteController {
public static void main(String[]args){
    PersonService personService=new PersonService();
    personService.deletePersonByIdService(2);
}
}
