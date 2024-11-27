package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.imp.EncounterDaoImp;
import com.vr.hospitalapp.dto.Encounter;

public class EncounterService {

    public void encounterDaoService(int bid,Encounter encounter){
        EncounterDaoImp daoImp=new EncounterDaoImp();
        Encounter encounter1=daoImp.saveEncounter(bid,encounter);
        
        if(encounter1!=null){
            System.out.println("Data Saved");
        }
        else{
            System.out.println("Data Not Saved");
        }
    }

    public void deleteEncounterByIdService(int id){
            EncounterDaoImp daoImp=new EncounterDaoImp();
           Boolean flag=daoImp.deleteEncounterById(id);
           if(flag){
            System.out.println("Data Deleted");
           }
           else{
            System.out.println("Data Not Deleted");
           }

    }

    public Encounter updateEncounterByIdService(int eid,Encounter encounter){
        EncounterDaoImp daoImp=new EncounterDaoImp();
       Encounter encounter1 =daoImp.updateEncounterById(eid, encounter);
            if(encounter1!=null){
                return encounter1;
            }
            else{
                return encounter1;
            }

    }

    public Encounter getEncounterByIdService(int eid){
        EncounterDaoImp daoImp=new EncounterDaoImp();
        Encounter encounter1=daoImp.getEncounterById(eid);
        if(encounter1!=null){
            return encounter1;
        }else{
            return null;
        }
}
   public List<Encounter>getAllEncounterService(){
    EncounterDaoImp daoImp=new EncounterDaoImp();
    List<Encounter>encounters=daoImp.getAllEncounter();
        if(encounters!=null){
            return encounters;
        }
        else{
            return null;
        }
   }
}