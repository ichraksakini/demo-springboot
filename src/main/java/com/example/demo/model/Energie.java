package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energie")
public class Energie {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "date")
    private String date;

    @Column(name = "heure_debut")
    private String heure_debut;

    @Column(name = "technicien")
    private String technicien;

    @Column(name = "gasoil_citerne_1")
    private String gasoil1;

    @Column(name = "gasoil_citerne_2")
    private String gasoil2;

    // GETTERS & SETTERS

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getHeure_debut() { return heure_debut; }
    public void setHeure_debut(String heure_debut) { this.heure_debut = heure_debut; }

    public String getTechnicien() { return technicien; }
    public void setTechnicien(String technicien) { this.technicien = technicien; }

    public String getGasoil1() { return gasoil1; }
    public void setGasoil1(String gasoil1) { this.gasoil1 = gasoil1; }

    public String getGasoil2() { return gasoil2; }
    public void setGasoil2(String gasoil2) { this.gasoil2 = gasoil2; }
}