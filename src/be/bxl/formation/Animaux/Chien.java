package be.bxl.formation.Animaux;

import java.time.LocalDate;

public class Chien extends Animal{
    private String cri;
    private String couleurCollier;
    private String race;


    //region Constructeur
    public Chien(String nom, String sexe, double taille, double poids, String annif,
                 String couleurCollier, String race) {
        super(nom, sexe, taille, poids, annif);
        this.couleurCollier=couleurCollier;
        this.race = race;
        Crier();

    }
    public Chien(Chien vChien) {
        super(vChien.getNom(), vChien.getSexe(), vChien.getTaille(), vChien.getPoids(), vChien.getAnnif());
        this.couleurCollier= vChien.getCouleurCollier();
        this.race = vChien.getRace();
        Crier();

    }

    public String getCouleurCollier() {
        return couleurCollier;
    }

    public String getRace() {
        return race;
    }

    @Override
    public void Crier(){
        cri ="Aboyer";
    }

    public void allInfo(){
        System.out.println(" le chien "+ cri);
        System.out.print(" nom " + super.getNom());
        System.out.print(" annif " + super.getAnnif());
        System.out.print(" poids " + super.getPoids());
        System.out.print(" sexe " + super.getSexe());
        System.out.print(" taille " + super.getTaille());
        System.out.print(" couleurCollier " + couleurCollier);
        System.out.println(" race " + race);


    }

}

