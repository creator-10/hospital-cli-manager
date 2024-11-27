package com.vr.hospitalapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Oid;
    private String dname;
    private String robservation;//reason for observation

    @JoinColumn
    @ManyToOne
    Encounter encounters;

    public int getOid() {
        return Oid;
    }

    public void setOid(int oid) {
        Oid = oid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getRobservation() {
        return robservation;
    }

    public void setRobservation(String robservation) {
        this.robservation = robservation;
    }

    public Encounter getEncounters() {
        return encounters;
    }

    public void setEncounters(Encounter encounters) {
        this.encounters = encounters;
    }

    @Override
    public String toString() {
        return "Observation [Oid=" + Oid + ", dname=" + dname + ", robservation=" + robservation + ", encounters="
                + encounters + "]";
    }

}
