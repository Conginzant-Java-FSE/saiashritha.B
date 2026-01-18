package com.example.jdbc.dao;

import com.example.jdbc.model.User;

public interface UserDAO {
    
    boolean registerUser(User user);
    
    User findByEmail(String email);
    
    boolean updatePassword(String email, String newPassword);
    
    User login(String email, String password);
    
    boolean deleteUser(String email);
    
    boolean updateProfile(String email, String username, String phoneNumber);
    
}

