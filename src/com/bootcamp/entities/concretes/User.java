package com.bootcamp.entities.concretes;

import com.bootcamp.entities.abstracts.Entity;

import java.util.List;

public class User implements Entity {
    private Integer Id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private List<Game> games;


    public User(Integer id, String name, String surname, String email, String password) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
