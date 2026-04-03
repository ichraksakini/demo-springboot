package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Energie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private Double valeur;
    private String date;

    public Long getId() { return id; }
    public String getNom() { return nom; }
    public Double getValeur() { return valeur; }
    public String getDate() { return date; }

    public void setId(Long id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setValeur(Double valeur) { this.valeur = valeur; }
    public void setDate(String date) { this.date = date; }
}