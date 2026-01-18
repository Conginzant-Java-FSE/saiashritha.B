package com.example.jdbc.service;

import com.example.jdbc.model.User;

public interface UserService {
    
    boolean registerUser(User user);
    
    User login(String email, String password);
    
    boolean deleteAccount(String email);
    
    User viewAccount(String email);
    
    boolean resetPassword(String email, String newPassword);
    
    boolean updateProfile(String email, String username, String phoneNumber);
    
}

