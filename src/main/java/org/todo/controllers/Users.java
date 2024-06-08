package org.todo.controllers;

import java.util.ArrayList;
import org.todo.models.Helpers.User;
import org.todo.models.UsersRepo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Users {

    private String name = "";
    private String userName = "";
    private String password = "";
    UsersRepo usersRepo = null;

    public Users() {
        this.usersRepo = new UsersRepo();
    }
       
    public Users(String userName, String Password) {
        this.userName = userName;
        this.password = Password;
        this.usersRepo = new UsersRepo();
    }
    
    public Users(String name, String userName, String Password) {
        this.name = name;
        this.userName = userName;
        this.password = Password;
        this.usersRepo = new UsersRepo();
    }
    
    
    public int userLogin(){    
        return this.usersRepo.loginUser(this.userName, this.password);
    }
    
    
    public  boolean userRegister(){   
        return this.usersRepo.insertUser(this.name, this.userName, this.password);
    }
    
    
    public  ArrayList<User> getUserList(){
        return this.usersRepo.getUserList();
    }
    
}
