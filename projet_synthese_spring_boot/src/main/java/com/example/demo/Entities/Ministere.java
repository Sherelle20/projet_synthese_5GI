package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ministere {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idMinistere;
    public String Designation;
    public String SiteInternet;
    public String Localisation;
    public String Ministere;
    public String SecretariatEtat;
}
