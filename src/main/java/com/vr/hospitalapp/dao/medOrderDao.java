package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.MedOrder;

public interface medOrderDao {
        public MedOrder saveMedOrder(int eid, MedOrder medOrder);

        public MedOrder getMedOrderById(int mid);

        public MedOrder updateMedOrderById(int mid, MedOrder medOrder);

        public Boolean deleteMedOrderById(int mid);

        public List<MedOrder> getAllMedOrder();

        public List<MedOrder> getAllMedOrderBYDoctorName(String name);

}
