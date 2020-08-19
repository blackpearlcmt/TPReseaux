package com.example.tpreseaux.model;

import com.google.gson.annotations.SerializedName;

public class Classe {

    @SerializedName("idClasse")
    private int idClasse;

    @SerializedName("libelle")
    private String libelle;

    public Classe(int idClasse, String libelle){
        this.idClasse= idClasse;
        this.libelle= libelle;
    }

    public int getIdClasse(){
        return idClasse;
    }

    public void setIdClasse(int idClasse){
        this.idClasse= idClasse;
    }

    public String getLibelle(){
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
