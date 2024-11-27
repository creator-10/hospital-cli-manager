package com.vr.hospitalapp.controller;


import com.vr.hospitalapp.dto.Encounter;
import com.vr.hospitalapp.service.EncounterService;

public class EncounterSaveController {
    public static void main(String[]args){
      EncounterService encounterService=new EncounterService();
      Encounter encounter=new Encounter();
      
      encounter.setReason("Cough");
      encounter.setDateofjoin("13/8/2008");
      encounter.setDateofdischarge("17/8/2008");
     
      encounterService.encounterDaoService(1,encounter);
    }
}
