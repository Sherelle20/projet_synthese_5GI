package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RessourcesZone {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idRessourcesZone;
    public String Ressource;
    public String Carateristique;
    public String UtilisationActuelle;
    public Boolean AccesControler;
    public Boolean Archive;

}
