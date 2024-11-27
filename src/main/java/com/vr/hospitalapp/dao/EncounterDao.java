package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.Encounter;

public interface EncounterDao {

    public Encounter saveEncounter(int bid,Encounter encounter);

    public Encounter updateEncounterById(int eid,Encounter encounter);

    Encounter  getEncounterById(int eid);

    Boolean deleteEncounterById(int eid);

    List<Encounter>getAllEncounter();
}
