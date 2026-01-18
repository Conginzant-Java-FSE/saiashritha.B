package com.example.jdbc.service;

import com.example.jdbc.dao.UserDAO;
import com.example.jdbc.dao.UserDAOImpl;
import com.example.jdbc.model.User;


public class UserServiceImpl implements UserService {
    
    private final UserDAO userDAO;
    
    public UserServiceImpl() {
        this.userDAO = new UserDAOImpl();
    }
    
    @Override
    public boolean registerUser(User user) {
        boolean success = userDAO.registerUser(user);
        return success;
    }
    
    @Override
    public User login(String email, String password) {
        User user = userDAO.login(email, password);
        if (user != null) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password!");
        }
        return user;
    }
    
    @Override
    public boolean deleteAccount(String email) {
        User user = userDAO.findByEmail(email);
        if (user == null) {
            System.out.println("User not found!");
            return false;
        }
        
        boolean success = userDAO.deleteUser(email);
        if (success) {
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Failed to delete account!");
        }
        return success;
    }
    
    @Override
    public User viewAccount(String email) {
        User user = userDAO.findByEmail(email);
        if (user == null) {
            System.out.println("User not found!");
        }
        return user;
    }
    
    @Override
    public boolean resetPassword(String email, String newPassword) {
        User existingUser = userDAO.findByEmail(email);
        if (existingUser == null) {
            System.out.println("User not found!");
            return false;
        }
        
        boolean success = userDAO.updatePassword(email, newPassword);
        if (success) {
            System.out.println("Password reset successfully!");
        } else {
            System.out.println("Password reset failed!");
        }
        return success;
    }
    
    @Override
    public boolean updateProfile(String email, String username, String phoneNumber) {
        User existingUser = userDAO.findByEmail(email);
        if (existingUser == null) {
            System.out.println("User not found!");
            return false;
        }
        
        boolean success = userDAO.updateProfile(email, username, phoneNumber);
        if (success) {
            System.out.println("Profile updated successfully!");
        } else {
            System.out.println("Profile update failed!");
        }
        return success;
    }
    
}

