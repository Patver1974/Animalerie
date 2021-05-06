package be.bxl.formation.Animaux;

import java.time.LocalDate;

public class Chien extends Animal{
    private String cri;

    //region Constructeur
    public Chien(String nom, char sexe, double taille, double poids, LocalDate annif) {
        super(nom, sexe, taille, poids, annif);
        Crier();

    }
    @Override
    public void Crier(){
        cri ="Aboyer";
    }

}

