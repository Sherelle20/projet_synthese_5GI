package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Chefferie")
public class Chefferie {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idChefferie;
    public String LibelleChefferie;
    public String Classification;
    public String NActeDeterminant;
    public String NomDuChef;
    public String Qualification;
    public String AnneAuTrone;

}
