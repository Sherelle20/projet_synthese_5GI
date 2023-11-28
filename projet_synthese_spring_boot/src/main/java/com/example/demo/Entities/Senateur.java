package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Senateur")
public class Senateur{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idSenateur;
    public String Qualite;
    public String Nom;
    public String Prenom;
    public String Mandat;
    public String Elu_Nomme;

}
