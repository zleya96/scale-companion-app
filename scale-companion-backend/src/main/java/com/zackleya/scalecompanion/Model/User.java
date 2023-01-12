package com.zackleya.scalecompanion.Model;

public class User {

    private int id;
    private String username;
    private String password_hash;

    public User(int id, String username, String password_hash) {
        this.id = id;
        this.username = username;
        this.password_hash = password_hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }
}
