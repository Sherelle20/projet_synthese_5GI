package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PossibiliteDeZone {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idPossibiliteDeZone;
    public String Specification;
    public String PossibiliteEmploi;
    public String AxeStrategique;

}
