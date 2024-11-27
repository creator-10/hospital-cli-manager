package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.Branch;

public interface BranchDao {
           Branch saveBranch(int hid,Branch branch);

           Branch getBranchById(int bid);

           Boolean DeleteBranchById(int hid,int bid);

           Branch updateBranchById(int bid,Branch branch);

           List<Branch> getAllBranch();
}
