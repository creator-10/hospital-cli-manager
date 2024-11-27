package com.vr.hospitalapp.controller;

import com.vr.hospitalapp.dto.Branch;
import com.vr.hospitalapp.service.BranchService;

public class BranchSaveController {

        public static void main(String[]args){
                BranchService branchService=new BranchService();
               Branch branch=new Branch();
                branch.setName("Chennai");
                branch.setEmail("appolo435@chennai.com");
                branch.setPhone(9874637938l);
                branchService.saveBranchService(2, branch);
        }
}
