package be.bxl.formation.Animaux;

import java.time.LocalDate;

public class Oiseau extends Animal{
    private String cri;

    //region Constructeur
    public Oiseau(String nom, char sexe, double taille, double poids, LocalDate annif) {
        super(nom, sexe, taille, poids, annif);
        Crier();

    }
    @Override
    public void Crier(){
        cri ="Je piaf";
    }

}

