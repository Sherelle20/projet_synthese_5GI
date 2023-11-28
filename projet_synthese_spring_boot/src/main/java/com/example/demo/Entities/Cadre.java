package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Cadre")
public class Cadre {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idCadre;
    public int CNiveau;
    public String Cadre;
    public Boolean Accessible;

}
