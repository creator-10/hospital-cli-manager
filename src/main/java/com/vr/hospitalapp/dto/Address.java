package com.vr.hospitalapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

    @Entity
public class Address {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int aid;
    private String street;
    private String country;
    private int pin;
    
    @OneToOne(mappedBy ="address")
    Branch branchs;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public Branch getBranchs() {
        return branchs;
    }
    public void setBranchs(Branch branchs) {
        this.branchs = branchs;
    }

}
