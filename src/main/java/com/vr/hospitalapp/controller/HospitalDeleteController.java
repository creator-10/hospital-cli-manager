package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.service.HospitalService;

public class HospitalDeleteController {
        public static void main(String[] args) {
            HospitalService service=new HospitalService();
            service.DeleteHospitalById(1);
            
        }
}
