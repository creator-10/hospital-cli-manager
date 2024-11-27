package com.vr.hospitalapp.service;


import com.vr.hospitalapp.dao.imp.HospitalDaoImp;
import com.vr.hospitalapp.dto.Hospital;

public class HospitalService {

    public void SaveHospital(Hospital hospital){
        HospitalDaoImp daoImp=new HospitalDaoImp();
        Hospital hospital1=daoImp.SaveHospital(hospital);
        if(hospital1!=null){
            System.out.println("Data Saved");

        }
        else{
            System.out.println("Unfortunately Data not Saved");
        }

    }

    public Hospital getHospitalById(int hid){
        HospitalDaoImp daoImp=new HospitalDaoImp();
        Hospital hospital=daoImp.getHospitalById(hid);
        if(hospital!=null){
            return hospital;
        }
        else{
            return null;
        }
    }
    public void DeleteHospitalById(int id){
        HospitalDaoImp daoImp=new HospitalDaoImp();
        Boolean flag=daoImp.DeleteHospitalById(id);
        if(flag){
            System.out.println("Data Deleted");
        }
        else{
            System.out.println("Data Not Deleted");
        }
    }

    public Hospital UpdateHospitalById(int id,Hospital hospital){
        HospitalDaoImp daoImp=new HospitalDaoImp();
        Hospital hospital2=daoImp.UpdateHospitalById(id,hospital);
        if(hospital2!=null){
            return hospital2;
        }
        else{
            return null;
        }
    }

   

   

    
}
