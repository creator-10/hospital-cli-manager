package com.vr.hospitalapp.service;

import java.util.List;


import com.vr.hospitalapp.dao.imp.ObservationDaoimp;
import com.vr.hospitalapp.dto.Observation;



 public class ObservationService {

        public void saveObservationService(int bid,Observation observation){
            ObservationDaoimp daoimp=new ObservationDaoimp();
            Observation observation1=daoimp.saveObservation(bid,observation);
            
          if(observation1!=null){
            System.out.println("Data Saved");
          }
          else{
            System.out.println("Data not Saved");
          }
    }

    public void deleteObservationByIdService(int iid){
        ObservationDaoimp daoimp=new ObservationDaoimp();
        Boolean flag=daoimp.deleteObservationById(iid);

            if(flag){
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data not Deleted");
            }
    }

    public Observation updateObservationByIdService(int oid,Observation observation){
        ObservationDaoimp daoimp=new ObservationDaoimp();
            Observation observation1=daoimp.updateObservationById(oid,observation);

           if(observation1!=null){
                return observation1;
           }
           else{
            return null;
           }
    }

    
    public Observation getObservationByIdService(int oid){
           ObservationDaoimp daoimp=new ObservationDaoimp();
           Observation observation1=daoimp.getObservationById(oid);
            if(observation1!=null){
                return observation1;
            }
            else{
                return null;
            }
    }

    public List<Observation> getAllObservationService(){
           ObservationDaoimp daoimp=new ObservationDaoimp();
            List<Observation>observation1=daoimp.getAllObservation();
            if(observation1!=null){
                return observation1;
            }
            
            else{
                return null;
            }
    }

    public List<Observation> getObservationsByDoctorNameService(String name){
        ObservationDaoimp daoimp=new ObservationDaoimp();
        List<Observation>observation1=daoimp.getObservationsByDoctorName(name);

        if(observation1!=null){
            return observation1;

        }
        else{
            return null;
        }
    }

}
