/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models;

/**
 *
 * @author lenovo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainModel {
    
    final String DB_URL = "jdbc:mysql://localhost:3306/todolist";
    final String USER = "root";
    final String PASS = "Isuru@3662";
    
    protected Connection conn = null;

    public MainModel()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(this.DB_URL, this.USER, this.PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Mysql connection error");
        }
    }
   
    
}
