/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.todo.models.Helpers.User;

/**
 *
 * @author lenovo
 */
public class UsersRepo extends MainModel{

    public UsersRepo() {
        super();
    }
    
    
   public int loginUser(String username, String password) {
         int userId = 0;
        String sql = "SELECT user_id, password FROM users WHERE username = ?";
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
               String passw = rs.getString("password");
               if(password.equals(passw)){
                   userId = rs.getInt("user_id");
               }
            }
        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
        }
        return userId;
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
    
     public ArrayList<User> getUserList(){
        
        ArrayList<User> userList = new ArrayList<>();
        
        String sql = "SELECT * FROM users;";
        
         try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            
            ResultSet rs = pstmt.executeQuery();
            while  (rs.next()) { 
                User user = new User(
                      rs.getInt("user_id"), 
                      rs.getString("name"), 
                      rs.getString("username"), 
                      rs.getString("created_at"), 
                      rs.getString("updated_at"), 
                      rs.getString("deleted_at"));
              
              userList.add(user);
             }
            
            
        } catch (SQLException e) {
            System.out.println("fetch: " + e.getMessage());
        }
        
        return  userList;
    }
    
}
