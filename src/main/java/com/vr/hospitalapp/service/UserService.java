package com.vr.hospitalapp.service;

import java.util.List;

import com.vr.hospitalapp.dao.imp.UserDaoimp;
import com.vr.hospitalapp.dto.User;



public class UserService {

              public void saveUserService(int bid,User user){
          UserDaoimp daoimp=new UserDaoimp();
          User user1=daoimp.saveUser(user);
            
          if(user1!=null){
            System.out.println("Data Saved");
          }
          else{
            System.out.println("Data not Saved");
          }
    }

    public void deleteUserByIdService(int iid){
      UserDaoimp daoimp=new UserDaoimp();
        Boolean flag=daoimp.deleteUserid(iid);

            if(flag){
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data not Deleted");
            }
    }

    public User updateUserByIdService(int oid,User User){
      UserDaoimp daoimp=new UserDaoimp();
          User User1=daoimp.updateUserId(oid,User);

           if(User1!=null){
                return User1;
           }
           else{
            return null;
           }
    }

    
    public User getUserByIdService(int iid){
         UserDaoimp daoimp=new UserDaoimp();
         User User1=daoimp.getUserById(iid);
            if(User1!=null){
                return User1;
            }
            else{
                return null;
            }
    }

    public List<User> getAllUsersService(){
         UserDaoimp daoimp=new UserDaoimp();
            List<User>User1=daoimp.getAlluser();
            if(User1!=null){
                return User1;
            }
            
            else{
                return null;
            }
    }

    public List<User> getUsersByRoleService(String role){
      UserDaoimp daoimp=new UserDaoimp();
        List<User>User1=daoimp.getUserByRole(role);

        if(User1!=null){
            return User1;

        }
        else{
            return null;
        }
    }
}
