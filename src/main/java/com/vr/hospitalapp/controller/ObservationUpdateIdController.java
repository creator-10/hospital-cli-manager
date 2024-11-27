package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Observation;
import com.vr.hospitalapp.service.ObservationService;

public class ObservationUpdateIdController {
    public static void main(String[]args){
        ObservationService observationService=new ObservationService();
        Observation observation=new Observation();
            observation.setDname("Mahesh");
        observationService.updateObservationByIdService(1,observation);
    }
}
