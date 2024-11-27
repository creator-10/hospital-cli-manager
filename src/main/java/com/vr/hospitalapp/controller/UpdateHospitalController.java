package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Hospital;
import com.vr.hospitalapp.service.HospitalService;

public class UpdateHospitalController {
    public static void main(String[]args){
    HospitalService hospitalservice=new HospitalService();
    Hospital hospital=new Hospital();
    hospital.setName("Appolo");
    hospital.setWebsite("www.appolo.com");
    hospitalservice.UpdateHospitalById(2,hospital);
}
}
