package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Probleme {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idProbleme;
    public String Probleme;
    public Boolean Archive;

}
