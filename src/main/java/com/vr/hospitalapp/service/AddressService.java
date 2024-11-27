package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.imp.AddressDaoImp;
import com.vr.hospitalapp.dto.Address;

public class AddressService {
    public void saveAddress(int bid,Address address){
            AddressDaoImp daoImp=new AddressDaoImp();
            Address address1=daoImp.saveAddress(bid,address);
            if(address1!=null){
                System.out.println("Data Saved");
            }
            else{
                System.out.println("Data Not Saved");
            }
    }

    public Address updateAddressById(int aid,Address address){
        AddressDaoImp daoImp=new AddressDaoImp();
        Address address1=daoImp.updateAddressById(aid, address);
        if(address1!=null){
            return address1;
        }
        else{
            return null;
        }
    }

    public void deleteAddressById(int aid){
        AddressDaoImp daoImp=new AddressDaoImp();
        Boolean flag=daoImp.deleteAddressById(aid);
        if(flag){
            System.out.println("Data Deleted");

        }
        else{
            System.out.println("Data Not Deleted");
        }
    }

    public Address getAddressById(int aid){
        AddressDaoImp daoImp=new AddressDaoImp();
        Address address=daoImp.getAddressById(aid);
        if(address!=null){
            return address;
        }
        else{
            return null;
        }
    }
        public List<Address> getAddressAll(){
            AddressDaoImp daoImp=new AddressDaoImp();
           List<Address> address1=daoImp.getAddressAll();
           if(address1!=null){
            return address1;
           }
           else{
            return null;
           }
        }
}
