package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.service.BranchService;

public class updateBranchController {
    public static void main(String[]args){
        BranchService branchService=new BranchService();
        Branch branch=new Branch();
        branch.setPhone(9758902346l);
        branch.setName("Trivandrum");
       
       branchService.updateBranchByIdService(1,branch);
       
    }
}
