package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.service.BranchService;

public class BranchGetIdController {
    public static void main(String[] args) {
        BranchService branchService=new BranchService();
        Branch branch=branchService.getBranchByIdService(1);
        
        System.out.println(branch.getBid());
        System.out.println(branch.getName());
        System.out.println(branch.getEmail());
       

    }
}
