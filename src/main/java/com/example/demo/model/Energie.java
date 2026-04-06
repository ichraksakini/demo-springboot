package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "energie")
public class Energie {

    @Id
    private String id;

    @Column(name = "date")
    private String date;

    @Column(name = "heure_debut")
    private String heure_debut;

    @Column(name = "technicien")
    private String technicien;
}