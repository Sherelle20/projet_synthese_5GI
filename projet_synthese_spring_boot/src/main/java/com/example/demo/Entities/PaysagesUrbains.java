package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaysagesUrbains {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idPaysagesUrbains;
    public String UnitePaysage;
    public String Utilisation;
    public String Potentialite;
    public String Utilisateur;
    public String Probleme;
    public String Causes;
    public String Consequences;
    public String Solutions;

}
