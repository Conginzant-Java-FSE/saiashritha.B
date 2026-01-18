package com.example.jdbc.dao;

import com.example.jdbc.config.DataBaseConfig;
import com.example.jdbc.model.User;

import java.sql.*;

public class UserDAOImpl implements UserDAO {
    
    @Override
    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (username, email, password,phn_num) VALUES (?, ?, ?,?)";
        
        try (Connection connection = DataBaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getPhoneNumber());
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error registering user: " + e.getMessage());
            return false;
        }
    }
    
    
    @Override
    public User findByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";
        
        try (Connection connection = DataBaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                return mapResultSetToUser(resultSet);
            }
            
        } catch (SQLException e) {
            System.err.println("Error finding user by email: " + e.getMessage());
        }
        
        return null;
    }
    
    @Override
    public boolean updatePassword(String email, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE email = ?";
        
        try (Connection connection = DataBaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, newPassword);
            statement.setString(2, email);
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating password: " + e.getMessage());
            return false;
        }
    }
    
    @Override
    public User login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        
        try (Connection connection = DataBaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                return mapResultSetToUser(resultSet);
            }
            
        } catch (SQLException e) {
            System.err.println("Error during login: " + e.getMessage());
        }
        
        return null;
    }
    
    @Override
    public boolean deleteUser(String email) {
        String sql = "DELETE FROM users WHERE email = ?";
        
        try (Connection connection = DataBaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, email);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error deleting user: " + e.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean updateProfile(String email, String username, String phoneNumber) {
        String sql = "UPDATE users SET username = ?, phn_num = ? WHERE email = ?";
        
        try (Connection connection = DataBaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, username);
            statement.setString(2, phoneNumber);
            statement.setString(3, email);
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating profile: " + e.getMessage());
            return false;
        }
    }
    
    private User mapResultSetToUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setPhoneNumber(resultSet.getString("phn_num"));
        user.setStatus(resultSet.getString("status"));
        
        return user;
    }
}

