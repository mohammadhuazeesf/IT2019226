/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todo.models.Helpers;

/**
 *
 * @author lenovo
 */
public class User {
    private int user_id;
    private String name;
    private String username;
    private String created_at;
    private String updated_at;
    private String deleted_at;

    public User() {
    }

    public User(int user_id, String name, String username, String created_at, String updated_at, String deleted_at) {
        this.user_id = user_id;
        this.name = name;
        this.username = username;
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

    public String getName() {
        return name;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
}
