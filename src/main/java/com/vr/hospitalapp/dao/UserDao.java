package com.vr.hospitalapp.dao;

import java.util.List;

import com.vr.hospitalapp.dto.User;


public interface UserDao {

        public User saveUser(User user);

        public User getUserById(int uid);

        public boolean deleteUserid(int uid);

        public User updateUserId(int uid,User user);

        public List<User> getAlluser();

        public List<User> getUserByRole(String role);
}               
