package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.imp.BranchDaoimp;
import com.vr.hospitalapp.dto.Branch;

public class BranchService {
        public void saveBranchService(int hid,Branch branch){
            BranchDaoimp daoimp=new BranchDaoimp();
            Branch branch1=daoimp.saveBranch(hid,branch);

            if(branch1!=null){
                System.out.println("Data Saved");

            }
            else{
                System.out.println("Data Not Saved");
            }

        }

        public void deleteBranchByIdService(int hid,int bid){
            BranchDaoimp daoimp=new BranchDaoimp();
            Boolean flag=daoimp.DeleteBranchById(hid, bid);

            if(flag){
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data Not Deleted");
            }

        }

        public Branch updateBranchByIdService(int bid,Branch branch){
            BranchDaoimp daoimp=new BranchDaoimp();
            Branch branch1=daoimp.updateBranchById(bid,branch);

            if(branch1!=null){
                return branch1;
            }
            else{
                return null;
            }

        }

        public Branch getBranchByIdService(int bid){
            BranchDaoimp daoimp=new BranchDaoimp();
            Branch branch1=daoimp.getBranchById(bid);
                   
            if(branch1!=null){
                return branch1;
            }
            else{
                return null;
            }
        }


        public List<Branch> getAllBranch(){
            BranchDaoimp daoimp=new BranchDaoimp();
            List<Branch>branch1=daoimp.getAllBranch();
            if(branch1!=null){
                return branch1;
            }
            else{
                return null;
            }
        }
}
