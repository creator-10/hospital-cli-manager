package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.service.EncounterService;

public class EncounterDeleteByIdController {
    public static void main(String[]args){
        EncounterService encounterService=new EncounterService();
        encounterService.deleteEncounterByIdService(2);
    }
}
