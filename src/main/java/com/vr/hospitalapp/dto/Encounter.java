package com.vr.hospitalapp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Encounter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String reason;
    private String datofjoin;
    private String dateofdischarge;

    @OneToMany(mappedBy = "encounters")
    private List<Observation>observations;

    @JoinColumn
    @OneToOne 
    private Person person;
    
    @JoinColumn
    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "encounters")
    private List <MedOrder>medOrders;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDatofjoin() {
        return datofjoin;
    }

    public void setDateofjoin(String datofjoin) {
        this.datofjoin = datofjoin;
    }

    public String getDateofdischarge() {
        return dateofdischarge;
    }

    public void setDateofdischarge(String dateofdischarge) {
        this.dateofdischarge = dateofdischarge;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public List<MedOrder> getMedOrders() {
        return medOrders;
    }

    public void setMedOrders(List<MedOrder> medOrders) {
        this.medOrders = medOrders;
    }

    @Override
    public String toString() {
        return "Encounter [eid=" + eid + ", reason=" + reason + ", datofjoin=" + datofjoin + ", dateofdischarge="
                + dateofdischarge + ", observations=" + observations + ", person=" + person + ", branch=" + branch
                + ", medOrders=" + medOrders + "]";
    }

}
