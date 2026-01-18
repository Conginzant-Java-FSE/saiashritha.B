package com.example.jdbc;

import com.example.jdbc.model.User;
import com.example.jdbc.service.UserService;
import com.example.jdbc.service.UserServiceImpl;

import java.util.Scanner;

public class Main {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserService userService = new UserServiceImpl();
    
    public static void main(String[] args) {
        System.out.println("\n==========================================");
        System.out.println("Please select an option:");
        System.out.println("1. Register New User");
        System.out.println("2. Login Account");
        System.out.println("3. Account Deletion");
        System.out.println("4. View Account");
        System.out.println("5. Forgot/Reset Password");
        System.out.println("6. Update Profile");
        System.out.println("7. Exit");
        System.out.println("==========================================");
        System.out.print("Enter your choice: ");


        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                deleteAccount();
                break;
            case 4:
                viewAccount();
                break;
            case 5:
                forgotPassword();
                break;
            case 6:
                updateProfile();
                break;
            case 7:
                System.out.println("Thank you for using the system. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
        
    }
    
   
    
    private static void updateProfile() {
        System.out.println("\n--- Update Profile ---");
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();
        
        System.out.print("Enter new username: ");
        String username = scanner.nextLine().trim();
        
        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine().trim();
        
        userService.updateProfile(email, username, phoneNumber);
        System.out.println("Profile updated successfully!");
    }



    private static void registerUser() {
        System.out.println("\n--- User Registration ---");
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();
        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine().trim();
        
        User user = new User(username, email, password, phoneNumber,"ACTIVE");
        boolean success = userService.registerUser(user);
        if (success) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Registration failed! Please try again.");
        }
    }
    
    private static void loginUser() {
        System.out.println("\n--- User Login ---");
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();
        
        User user = userService.login(email, password);
        if (user != null) {
            System.out.println("Welcome, " + user.getUsername() + "!");
        }
    }
    
    private static void deleteAccount() {
        System.out.println("\n--- Account Deletion ---");
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();
        
        if (email.isEmpty()) {
            System.out.println("Email is required!");
            return;
        }
        
        userService.deleteAccount(email);
    }
    
    private static void viewAccount() {
        System.out.println("\n--- View Account ---");
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();
        
        if (email.isEmpty()) {
            System.out.println("Email is required!");
            return;
        }
        
        User user = userService.viewAccount(email);
        if (user != null) {
            System.out.println("\n--- Account Details ---");
            System.out.println("ID: " + user.getId());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Status: " + user.getStatus());
        }
    }
    
    private static void forgotPassword() {
        System.out.println("\n--- Forgot Password / Reset Password ---");
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();
        
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine().trim();
        
        if (email.isEmpty() || newPassword.isEmpty()) {
            System.out.println("Email and new password are required!");
            return;
        }
        
        userService.resetPassword(email, newPassword);
    }
    
}
