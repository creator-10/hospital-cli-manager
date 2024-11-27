package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Hospital;
import com.vr.hospitalapp.service.HospitalService;

public class HospitalSaveController {
public static void main(String[] args) {
    
        HospitalService service=new HospitalService();
        Hospital hospital=new Hospital();
        hospital.setName("Appolo");
        hospital.setWebsite("www.appolo.com");

        hospital.setName("Pushpagiri");
        hospital.setWebsite("www.pushpagiri.com");
     
        hospital.setName("Renai");
        hospital.setWebsite("www.renai.com");
        service.SaveHospital(hospital);

  }
}
