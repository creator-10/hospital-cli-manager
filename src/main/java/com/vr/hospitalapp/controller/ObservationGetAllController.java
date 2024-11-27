package com.vr.hospitalapp.controller;

import java.util.List;

import com.vr.hospitalapp.dto.Observation;
import com.vr.hospitalapp.service.ObservationService;

public class ObservationGetAllController {
            public static void main(String[]args){
            ObservationService observationService=new ObservationService();
            List<Observation> observation=observationService.getAllObservationService();  
               for (Observation observation1 : observation) {
                System.out.println(observation1.getOid());
                System.out.println(observation1.getDname());
                 System.out.println(observation1.getRobservation());
                 System.out.println(observation1.getEncounters());
                 System.out.println("_______________________________");
               }     
           
            }
}
