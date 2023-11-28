package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
public class Infrastructure {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int idInfrastructure;
    public String Libelle;
    public String Etat;
    public  int Qte;
    public String Beneficiaire;
    public String Observation;
    public String GroupeInfrastructure;

    @Override
    public String toString() {
        return "Infrastructure{" +
                "idInfrastructure=" + idInfrastructure +
                ", Libelle='" + Libelle + '\'' +
                ", Etat='" + Etat + '\'' +
                ", Qte=" + Qte +
                ", Beneficiaire='" + Beneficiaire + '\'' +
                ", Observation='" + Observation + '\'' +
                ", GroupeInfrastructure='" + GroupeInfrastructure + '\'' +
                '}';
    }

    public void setIdInfrastructure(int idInfrastructure) {
        this.idInfrastructure = idInfrastructure;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public void setEtat(String etat) {
        Etat = etat;
    }

    public void setQte(int qte) {
        Qte = qte;
    }

    public void setBeneficiaire(String beneficiaire) {
        Beneficiaire = beneficiaire;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public void setGroupeInfrastructure(String groupeInfrastructure) {
        GroupeInfrastructure = groupeInfrastructure;
    }

    public String getLibelle() {
        return Libelle;
    }

    public String getEtat() {
        return Etat;
    }

    public int getQte() {
        return Qte;
    }

    public String getBeneficiaire() {
        return Beneficiaire;
    }

    public String getObservation() {
        return Observation;
    }

    public String getGroupeInfrastructure() {
        return GroupeInfrastructure;
    }

    public Infrastructure(int idInfrastructure, String libelle, String etat, int qte, String beneficiaire, String observation, String groupeInfrastructure) {
        this.idInfrastructure = idInfrastructure;
        Libelle = libelle;
        Etat = etat;
        Qte = qte;
        Beneficiaire = beneficiaire;
        Observation = observation;
        GroupeInfrastructure = groupeInfrastructure;

    }
}
