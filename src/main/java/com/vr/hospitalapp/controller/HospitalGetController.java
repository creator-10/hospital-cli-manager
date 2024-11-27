package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Hospital;
import com.vr.hospitalapp.service.HospitalService;

public class HospitalGetController {
     public static void main(String[] args) {
           HospitalService hospitalService=new HospitalService();
           Hospital hospital=hospitalService.getHospitalById(2); 
            System.out.println(hospital);
            }

}
