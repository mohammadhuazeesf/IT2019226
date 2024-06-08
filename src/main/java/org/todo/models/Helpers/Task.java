/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models.Helpers;

/**
 *
 * @author lenovo
 */
public class Task {
    private int id;
    private int user_id;
    private String task_area;
    private String task_desc;
    private String status;
    private String created_at;
    private String updated_at;
    private String deleted_at;

    public Task() {
    }

    public Task(int id, int user_id, String task_area, String task_desc, String status, String created_at, String updated_at, String deleted_at) {
        this.id = id;
        this.user_id = user_id;
        this.task_area = task_area;
        this.task_desc = task_desc;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getTask_area() {
        return task_area;
    }

    public String getTask_desc() {
        return task_desc;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTask_area(String task_area) {
        this.task_area = task_area;
    }

    public void setTask_desc(String task_desc) {
        this.task_desc = task_desc;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    
    
    
}
