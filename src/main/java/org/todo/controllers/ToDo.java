/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.controllers;

import org.todo.models.ToDoRepo;

/**
 *
 * @author lenovo
 */
public class ToDo {

    public ToDo() {
    }
    
    public boolean createTask(int userId, String area, String desc, String status){
        ToDoRepo doRepo = new ToDoRepo();
        return doRepo.createTask(userId, area, desc, status);
    }
    
}
