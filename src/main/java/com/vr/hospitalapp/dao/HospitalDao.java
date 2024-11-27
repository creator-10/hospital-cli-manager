package com.vr.hospitalapp.dao;

import com.vr.hospitalapp.dto.Hospital;

public interface HospitalDao {

        Hospital SaveHospital(Hospital hospital);

        Hospital getHospitalById(int id);

        Boolean DeleteHospitalById(int id);

        Hospital UpdateHospitalById(int id, Hospital hospital);
}
