package be.bxl.formation.Animaux;

import java.time.LocalDate;

public class Animal {

    private String nom;

    private char sexe;
    private double taille;
    private double poids;
    private LocalDate localDate;

    public Animal(String nom, char sexe, double taille, double poids, LocalDate annif) {
        this.nom = nom;
        this.sexe = sexe;
        this.taille = taille;
        this.poids = poids;
        this.localDate = annif;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    return ;
    }

    public void setTaille(double taille) {
            this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }
    public double getTaille() {
        return taille;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public char getSexe() {
        return sexe;
    }
    public void Crier(){

    }

}
