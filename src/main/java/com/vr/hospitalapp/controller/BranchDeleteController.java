package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.service.BranchService;

public class BranchDeleteController {
    public static void main(String[]args){
        BranchService branchService=new BranchService();
        branchService.deleteBranchByIdService(2, 2);
    }
}
