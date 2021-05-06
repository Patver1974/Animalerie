package be.bxl.formation.Animaux;

import java.time.LocalDate;

public class Oiseau extends Animal {
    private String cri;
    private boolean cage;
    private String couleur;

    //region Constructeur
    public Oiseau(String nom, String sexe, double taille, double poids, String annif, boolean cage, String couleur) {
        super(nom, sexe, taille, poids, annif);
        this.cage= cage;
        this.couleur= couleur;
        Crier();

    }
    public Oiseau(Oiseau voiseau) {
        super(voiseau.getNom(), voiseau.getSexe(), voiseau.getTaille(), voiseau.getPoids(), voiseau.getAnnif());
        this.cage = voiseau.cage;
        this.couleur= voiseau.getCouleur();
        Crier();

    }

    public String getCri() {
        return cri;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isCage() {
        return cage;
    }

    public String EstDansCage() {
        String str;
        if (isCage()) ;
        str = " A mettre dans une cage ";
        str = " a mettre dans une voliere ";
        return str;

    }

    public void allInfo() {
        System.out.println(" le oiseau " + cri);
        System.out.print(" nom " + super.getNom());
        System.out.print(" annif " + super.getAnnif());
        System.out.print(" poids " + super.getPoids());
        System.out.print(" sexe " + super.getSexe());
        System.out.print(" taille " + super.getTaille());
        System.out.println(EstDansCage());

    }



    @Override
    public void Crier() {
        cri = "Je piaf";
    }

}

