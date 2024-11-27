package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.imp.PersonDaoimp;
import com.vr.hospitalapp.dto.Person;



public class PersonService {

public void savePersonService(int bid,Person person){
          PersonDaoimp daoimp=new PersonDaoimp();
          Person person1=daoimp.savePerson(bid,person);
            
          if(person1!=null){
            System.out.println("Data Saved");
          }
          else{
            System.out.println("Data not Saved");
          }
    }

    public void deletePersonByIdService(int iid){
      PersonDaoimp daoimp=new PersonDaoimp();
        Boolean flag=daoimp.deletePersonById(iid);

            if(flag){
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data not Deleted");
            }
    }

    public Person updatePersonByIdService(int oid,Person person){
      PersonDaoimp daoimp=new PersonDaoimp();
          Person person1=daoimp.updatePersonById(oid,person);

           if(person1!=null){
                return person1;
           }
           else{
            return null;
           }
    }

    
    public Person getPersonByIdService(int iid){
         PersonDaoimp daoimp=new PersonDaoimp();
         Person person1=daoimp.getPersonById(iid);
            if(person1!=null){
                return person1;
            }
            else{
                return null;
            }
    }

    public List<Person> getAllPersonsService(){
         PersonDaoimp daoimp=new PersonDaoimp();
            List<Person>person1=daoimp.getAllperson();
            if(person1!=null){
                return person1;
            }
            
            else{
                return null;
            }
    }

    public List<Person> getPersonsByGenderService(String gender){
      PersonDaoimp daoimp=new PersonDaoimp();
        List<Person>person1=daoimp.getPersonByGender(gender);

        if(person1!=null){
            return person1;

        }
        else{
            return null;
        }
    }

    public List<Person> getPersonsByAgeService(String age){
        PersonDaoimp daoimp=new PersonDaoimp();
          List<Person>person1=daoimp.getPersonByGender(age);
  
          if(person1!=null){
              return person1;
  
          }
          else{
              return null;
          }
      }

      public List<Person> getPersonsByPhoneService(long phone){
        PersonDaoimp daoimp=new PersonDaoimp();
          List<Person>person1=daoimp.getPersonByPhone(phone);
  
          if(person1!=null){
              return person1;
  
          }
          else{
              return null;
          }
      }

}
