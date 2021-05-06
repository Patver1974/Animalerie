package be.bxl.formation.Animaux;

import java.time.LocalDate;

public class Chat extends Animal{
private String cri;
private boolean griffeCoupee;
private boolean poilLong;
private String caractere;


    //region Constructeur
    public Chat(String nom, char sexe, double taille, double poids, LocalDate annif, boolean poilLong,) {
        super(nom, sexe, taille, poids, annif);
        Crier();

    }
    @Override
public void Crier(){
        cri ="Miauler";
    }


}

