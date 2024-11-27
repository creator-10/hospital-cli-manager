package com.vr.hospitalapp.controller;

import java.util.List;

import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.service.BranchService;

public class BranchGetAllController {

    public static void main(String[] args) {
        BranchService branchService=new BranchService();
        List<Branch>branch=branchService.getAllBranch();
        for (Branch branch2 : branch) {
            System.out.println(branch2.getBid());
            System.out.println(branch2.getName());
            System.out.println(branch2.getPhone());
            System.out.println(branch2.getEmail());
            System.out.println("_______________________");
        }
    }
}
