package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Encounter;
import com.vr.hospitalapp.service.EncounterService;

public class EncounterUpdateIdController {
    public static void main(String[] args) {
        EncounterService encounterService=new EncounterService();
            Encounter encounter=new Encounter();
            encounter.setDateofjoin("16/8/2008");
            encounter.setDateofdischarge("18/8/2008");
            encounterService.updateEncounterByIdService(3,encounter);
    }
}
