package com.example.javabase.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    User() {}

    User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setUsername(){
        this.username = username;
    }

    public void setEmail(){
        this.email = email;
    }
}
