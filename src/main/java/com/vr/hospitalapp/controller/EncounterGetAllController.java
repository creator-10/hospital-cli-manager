package com.vr.hospitalapp.controller;

import java.util.List;

import com.vr.hospitalapp.dto.Encounter;
import com.vr.hospitalapp.service.EncounterService;

public class EncounterGetAllController {

    public static void main(String[]args){
        EncounterService encounterService=new EncounterService();
        List<Encounter>encounter=encounterService.getAllEncounterService();
        for (Encounter encounter1 : encounter) {
            System.out.println(encounter1.getEid());
            System.out.println(encounter1.getReason());
            System.out.println(encounter1.getDatofjoin());
            System.out.println(encounter1.getDateofdischarge());
            System.out.println("______________________________");
        }
    }
}
