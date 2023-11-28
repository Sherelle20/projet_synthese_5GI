package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Region {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int CodeRegion;
    public String Libelle;
    public Boolean Accessible;
    public Date DateCreation;
    public int Densite;
    public double Superficie;

}
