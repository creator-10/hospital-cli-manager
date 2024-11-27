package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.imp.medOrderDaoimp;
import com.vr.hospitalapp.dto.MedOrder;


public class medOrderService {


        public void savemedOrderService(int eid,MedOrder medOrder){
            medOrderDaoimp daoimp=new medOrderDaoimp();
            MedOrder medOrder1=daoimp.saveMedOrder(eid,medOrder);
            
          if(medOrder1!=null){
            System.out.println("Data Saved");
          }
          else{
            System.out.println("Data not Saved");
          }
    }

    public void deletemedOrderByIdService(int iid){
        medOrderDaoimp daoimp=new medOrderDaoimp();
        Boolean flag=daoimp.deleteMedOrderById(iid);

            if(flag){
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data not Deleted");
            }
    }

    public MedOrder updatemedOrderByIdService(int oid,MedOrder medOrder){
        medOrderDaoimp daoimp=new medOrderDaoimp();
            MedOrder medOrder1=daoimp.updateMedOrderById(oid,medOrder);

           if(medOrder1!=null){
                return medOrder1;
           }
           else{
            return null;
           }
    }

    
    public MedOrder getMedByIdService(int iid){
           medOrderDaoimp daoimp=new medOrderDaoimp();
           MedOrder medOrder1=daoimp.getMedOrderById(iid);
            if(medOrder1!=null){
                return medOrder1;
            }
            else{
                return null;
            }
    }

    public List<MedOrder> getAllMedService(){
           medOrderDaoimp daoimp=new medOrderDaoimp();
            List<MedOrder>medOrder1=daoimp.getAllMedOrder();
            if(medOrder1!=null){
                return medOrder1;
            }
            
            else{
                return null;
            }
    }

    public List<MedOrder> getmedOrdersByDoctorNameService(String name){
        medOrderDaoimp daoimp=new medOrderDaoimp();
        List<MedOrder>medOrder1=daoimp.getAllMedOrderBYDoctorName(name);

        if(medOrder1!=null){
            return medOrder1;

        }
        else{
            return null;
        }
    }

}
