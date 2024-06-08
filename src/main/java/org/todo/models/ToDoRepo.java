/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.todo.models.Helpers.Task;

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
    
    
    public ArrayList<Task> getTaskList(int userId){
        
        ArrayList<Task> taskList = new ArrayList<>();
        
        String sql = "SELECT * FROM task_list WHERE user_id = ?;";
        
         try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
              pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
             while  (rs.next()) { 
              Task task = new Task(rs.getInt("id"), 
                      rs.getInt("user_id"), 
                      rs.getString("task_area"), 
                      rs.getString("task_desc"), 
                      rs.getString("status"), 
                      rs.getString("created_at"), 
                      rs.getString("updated_at"), 
                      rs.getString("deleted_at"));
              
              taskList.add(task);
             }
            
            
        } catch (SQLException e) {
            System.out.println("fetch: " + e.getMessage());
        }
        
        return  taskList;
    }
    
    
    public boolean updateTask(int id, String taskArea, String taskDesc, String status) {
        String sql = "UPDATE task_list SET task_area = ?, task_desc = ?, status = ?, updated_at = CURRENT_TIMESTAMP WHERE id = ?";

        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, taskArea);
            pstmt.setString(2, taskDesc);
            pstmt.setString(3, status);
            pstmt.setInt(4, id);

            int affectedRows = pstmt.executeUpdate();

            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
            return false;
        }
      
    }
    
     public boolean deleteTask(int id) {
        String sql = "DELETE FROM task_list WHERE id = ?";

        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);

            int affectedRows = pstmt.executeUpdate();

            return affectedRows > 0;
        } catch (SQLException e) {
             System.out.println("Delete error: " + e.getMessage());
        return false;
        }
      
    }
}
