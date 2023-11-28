package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PotentialitesDesZones {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idPotentialitesDesZones;
    public String Potentialite;
    public String Ressource;

}
