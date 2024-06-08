/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.controllers;

import java.util.ArrayList;
import org.todo.models.Helpers.Task;
import org.todo.models.ToDoRepo;

/**
 *
 * @author lenovo
 */
public class ToDo {

    ToDoRepo doRepo = null;
            
    public ToDo() {
        doRepo = new ToDoRepo();
    }
    
    public boolean createTask(int userId, String area, String desc, String status){
        return doRepo.createTask(userId, area, desc, status);
    }
    
    public  ArrayList<Task> getTaskList(int userId){
        return doRepo.getTaskList(userId);
    }
    
    public boolean updateToDo(int taskId, String area, String desc, String status){
        return doRepo.updateTask(taskId, area, desc, status);
    }
    
    public boolean deleteToDo(int taskId){
        return doRepo.deleteTask(taskId);
    }
}
