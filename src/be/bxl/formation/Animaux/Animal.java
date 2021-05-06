package be.bxl.formation.Animaux;

import java.time.LocalDate;



public class Animal {

    private String nom;

    private String sexe;
    private double taille;
    private double poids;
    private LocalDate annif ;

    public Animal(String nom, String sexe, double taille,
                  double poids, String annif) {
        this.nom = nom;
        this.sexe = sexe;
        this.taille = taille;
        this.poids = poids;
        this.annif= LocalDate.parse(annif);
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnif() {
        return annif.toString();
    }

    public String getSexe() {
        return sexe;
    }
    public void Crier(){

    }

    public void AllInfo(){



    }

}
