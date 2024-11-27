package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.service.ObservationService;

public class ObservationDeleteIdController {
    public static void main(String[] args) {
        ObservationService observationService=new ObservationService();
        observationService.deleteObservationByIdService(2);
    }
}
