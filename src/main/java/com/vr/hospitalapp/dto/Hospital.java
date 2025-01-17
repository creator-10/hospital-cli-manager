package com.vr.hospitalapp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int hid;
    private String name;
    private String website;
    @OneToMany(mappedBy="hospital")
    List<Branch>branch;
    


    public int getHid() {
        return hid;
    }
    public void setHid(int hid) {
        this.hid = hid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public List<Branch> getBranch() {
        return branch;
    }
    public void setBranch(List<Branch> branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Hospital [hid=" + hid + ", name=" + name + ", website=" + website + ", branch=" + branch + "]";
    }

}
