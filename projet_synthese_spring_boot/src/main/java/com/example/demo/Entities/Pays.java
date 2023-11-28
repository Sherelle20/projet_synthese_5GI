package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pays {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int CodePays;
    public String Libelle;
    public Boolean Accessible;
    public String Densite;
    public int Superficie;
    public Date DateIndependance;
    public Date DateReunification;
    public Date DateUnification;

}
