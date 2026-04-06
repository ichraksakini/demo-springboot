package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Energie {

    @Id
    private String id;   // 🔥 IMPORTANT : String (pas Long)

    private String date;
    private String heure_debut;
    private String technicien;

    // getters & setters
}