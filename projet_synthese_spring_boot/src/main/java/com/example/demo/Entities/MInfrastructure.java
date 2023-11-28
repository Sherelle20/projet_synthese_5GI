package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MInfrastructure {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idMInfrastructure;
    public String MInfrastructure;
}
