package org.todo.controllers;

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
    
    
    public boolean userLogin(){   
        String storedPassword = this.usersRepo.loginUser(this.userName);
        return storedPassword.isEmpty() && password.equals(storedPassword);
    }
    
    
    public  boolean userRegister(){   
        return this.usersRepo.insertUser(this.name, this.userName, this.password);
    }
    
}