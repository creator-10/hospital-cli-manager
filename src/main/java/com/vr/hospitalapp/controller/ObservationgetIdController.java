package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Observation;
import com.vr.hospitalapp.service.ObservationService;

public class ObservationgetIdController {
    public static void main(String[] args) {
        ObservationService observationService=new ObservationService();
        Observation observation=observationService.getObservationByIdService(1);
        System.out.println(observation.getOid());
        System.out.println(observation.getDname());
        System.out.println(observation.getRobservation());
        System.out.println(observation.getEncounters());
    }
}
