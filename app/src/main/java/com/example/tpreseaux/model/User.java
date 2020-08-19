package com.example.tpreseaux.model;
import com.google.gson.annotations.SerializedName;
public class User {
    @SerializedName("Nom")
    private int Nom;

    @SerializedName("Prenom")
    private int Prenom;

    @SerializedName("Matricule")
    private int Matricule;

    @SerializedName("Age")
    private int Age;

    @SerializedName("Username")
    private int Username;

    @SerializedName("Password")
    private int Password;

    @SerializedName("idClasse")
    private int idClasse;

    public User(int nom, int prenom, int matricule, int age, int username, int password, int idClasse) {
        Nom = nom;
        Prenom = prenom;
        Matricule = matricule;
        Age = age;
        Username = username;
        Password = password;
        this.idClasse = idClasse;
    }

    public int getNom() {
        return Nom;
    }

    public void setNom(int nom) {
        Nom = nom;
    }

    public int getPrenom() {
        return Prenom;
    }

    public void setPrenom(int prenom) {
        Prenom = prenom;
    }

    public int getMatricule() {
        return Matricule;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getUsername() {
        return Username;
    }

    public void setUsername(int username) {
        Username = username;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }
}
