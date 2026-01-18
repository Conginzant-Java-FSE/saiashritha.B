package com.example.jdbc.model;


public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String status;
    
    public User() {
    }
    
    public User(String username, String email, String password,String phoneNumber, String status) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber=phoneNumber;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}

