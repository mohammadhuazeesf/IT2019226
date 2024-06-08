/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class UsersRepo extends MainModel{

    public UsersRepo() {
        super();
    }
    
    
   public String loginUser(String username) {
        String passw = "";
        String sql = "SELECT password FROM users WHERE username = ?";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
               passw = rs.getString("password");
            }
        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
        }
        return passw;
    }
   
   
     public boolean insertUser( String name, String username, String password) {
        String sql = "INSERT INTO users (name, username, password) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, username);
            pstmt.setString(3, password);
          
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Insert user error: " + e.getMessage());
        }
        return false;
    }
    
    
}
