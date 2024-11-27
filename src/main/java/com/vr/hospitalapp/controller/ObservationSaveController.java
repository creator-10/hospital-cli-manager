package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Observation;
import com.vr.hospitalapp.service.ObservationService;

public class ObservationSaveController {
    public static void main(String[]args){
        ObservationService observationService=new ObservationService();
        Observation observation=new Observation();
        observation.setDname("Rahul");
        observation.setRobservation("fever");
        observationService.saveObservationService(1,observation);
    }
}
