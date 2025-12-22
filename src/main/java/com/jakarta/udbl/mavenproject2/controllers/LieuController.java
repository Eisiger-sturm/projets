package com.jakarta.udbl.mavenproject2.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("lieuController")
@RequestScoped
public class LieuController {

    private String nom;
    private String description;
    private double latitude;
    private double longitude;

    // getters & setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String enregistrer() {
        System.out.println("Lieu ajouté : " + nom + " (" + latitude + "," + longitude + ")");
        return "home";
    }
}
