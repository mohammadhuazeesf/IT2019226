/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class ToDoRepo extends MainModel{

    public ToDoRepo() {
        super();
    }
    
    public boolean createTask(int userId, String area, String desc, String status){
        String sql = "INSERT INTO task_list (user_id, task_area, task_desc, status) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, area);
            pstmt.setString(3, desc);
            pstmt.setString(4, status);
            pstmt.executeUpdate();
            
          return true;
        } catch (SQLException e) {
            System.out.println("Insert user error: " + e.getMessage());
        }
        
        return false;
    }
}
