package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.Observation;


public interface ObservationDao {


       public Observation saveObservation(int bid,Observation observation);

       public  Observation updateObservationById(int oid,Observation observation);

       public  Observation getObservationById(int oid);

       public Boolean deleteObservationById(int oid);

       public List<Observation>getAllObservation();
       
       public List<Observation> getObservationsByDoctorName(String name);
}
