package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Localite")
public class Localite {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int codeLocalite;
    public String Libelle;
    public int PNombreMenage;
    public float PPolutaion;
    public int IEEcodeMaternelle;
    public int IEEcodePrimaire;
    public int IEEcodeSecondaire;
}
