package com.vr.hospitalapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Iid;
    private String itemName;
    private double cost;
    private int quantity;

    @ManyToOne
    @JoinColumn
    MedOrder medOrder;

    public int getIid() {
        return Iid;
    }

    public void setIid(int iid) {
        Iid = iid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MedOrder getMedOrder() {
        return medOrder;
    }

    public void setMedOrder(MedOrder medOrder) {
        this.medOrder = medOrder;
    }

    @Override
    public String toString() {
        return "Item [Iid=" + Iid + ", itemName=" + itemName + ", cost=" + cost + ", quantity=" + quantity
                + ", medOrder=" + medOrder + "]";
    }

}
