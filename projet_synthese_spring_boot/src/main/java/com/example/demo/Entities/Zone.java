package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Zone {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idZone;
    public String Zone;
    public String ZNiveau;
    public int NbDepartement;
    public int NbCommune;
    public int NbLocalite;
    public int Superficies;


    public Zone(int idZone, String zone, String ZNiveau, int nbDepartement, int nbCommune, int nbLocalite, int superficies) {
        this.idZone = idZone;
        Zone = zone;
        this.ZNiveau = ZNiveau;
        NbDepartement = nbDepartement;
        NbCommune = nbCommune;
        NbLocalite = nbLocalite;
        Superficies = superficies;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "idZone=" + idZone +
                ", Zone='" + Zone + '\'' +
                ", ZNiveau='" + ZNiveau + '\'' +
                ", NbDepartement=" + NbDepartement +
                ", NbCommune=" + NbCommune +
                ", NbLocalite=" + NbLocalite +
                ", Superficies=" + Superficies +
                '}';
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public void setZNiveau(String ZNiveau) {
        this.ZNiveau = ZNiveau;
    }

    public void setNbDepartement(int nbDepartement) {
        NbDepartement = nbDepartement;
    }

    public void setNbCommune(int nbCommune) {
        NbCommune = nbCommune;
    }

    public void setNbLocalite(int nbLocalite) {
        NbLocalite = nbLocalite;
    }

    public void setSuperficies(int superficies) {
        Superficies = superficies;
    }

    public String getZone() {
        return Zone;
    }

    public String getZNiveau() {
        return ZNiveau;
    }

    public int getNbDepartement() {
        return NbDepartement;
    }

    public int getNbCommune() {
        return NbCommune;
    }

    public int getNbLocalite() {
        return NbLocalite;
    }

    public int getSuperficies() {
        return Superficies;
    }
}
