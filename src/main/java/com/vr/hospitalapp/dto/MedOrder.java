package com.vr.hospitalapp.dto;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int mid;
 private String dname;
 private String orderdate;

 @OneToMany(mappedBy = "medOrder")
 List<Item>items;

 @JoinColumn
 @ManyToOne
 Encounter encounters;

public int getMid() {
    return mid;
}

public void setMid(int mid) {
    this.mid = mid;
}

public String getDname() {
    return dname;
}

public void setDname(String dname) {
    this.dname = dname;
}

public String getOrderdate() {
    return orderdate;
}

public void setOrderdate(String orderdate) {
    this.orderdate = orderdate;
}

public List<Item> getItems() {
    return items;
}

public void setItems(List<Item> items) {
    this.items = items;
}

public Encounter getEncounters() {
    return encounters;
}

public void setEncounters(Encounter encounters) {
    this.encounters = encounters;
 }

@Override
public String toString() {
    return "MedOrder [mid=" + mid + ", dname=" + dname + ", orderdate=" + orderdate + ", items=" + items
            + ", encounters=" + encounters + "]";
}

}
