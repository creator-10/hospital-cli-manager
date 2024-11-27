package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Encounter;
import com.vr.hospitalapp.service.EncounterService;

public class EncounterGetIdController {
    public static void main(String[]args){
        EncounterService encounterService=new EncounterService();
        Encounter encounter=encounterService.getEncounterByIdService(3);
        System.out.println(encounter.getEid());
        System.out.println(encounter.getReason());
        System.out.println(encounter.getDatofjoin());
        System.out.println(encounter.getDateofdischarge());
        System.out.println("________________________________");
        
    }
}
