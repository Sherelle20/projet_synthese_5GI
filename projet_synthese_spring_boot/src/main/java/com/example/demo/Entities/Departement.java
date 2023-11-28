package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Departement")
public class Departement {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idDepartement;
    public String NomDepartement;

}
