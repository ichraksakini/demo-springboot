package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energie")
public class Energie {

    @Id
    @Column(name = "id")
    private String id;

    public Energie() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}