package be.bxl.formation.Animaux;

import java.time.LocalDate;
import java.util.Date;


public class Chat extends Animal {
    private String cri;
    private boolean griffeCoupee;
    private boolean poilLong;
    private String caractere;


    //region Constructeur
    public Chat(String nom, String sexe, double taille,
                double poids, String annif, boolean poilLong, boolean griffeCoupee, String caractere) {
        super(nom, sexe, taille, poids, annif);
        this.poilLong = poilLong;
        this.griffeCoupee=griffeCoupee;
        this.caractere = caractere;

        Crier();

    }
    public Chat(Chat vchat){
        super(vchat.getNom(), vchat.getSexe(), vchat.getTaille(), vchat.getPoids(), vchat.getAnnif());
        this.poilLong = vchat.poilLong;
        this.griffeCoupee=vchat.griffeCoupee;
        this.caractere = vchat.getCaractere();



    }
    public String getCaractere() {
        return caractere;
    }

    public String getCri() {
        return cri;
    }
private boolean  isGriffeCoupee(){
        return griffeCoupee;

}
public String EstGriffeCoupee(){
        String str ;
        if (this.griffeCoupee) {str=" Les griffes sont coupees";} else {str=" Les griffes sont pas coupee";}
return str;
}
    public boolean  isPoilLong(){
        return poilLong;

    }
    public void setGriffeCoupee(boolean griffeCoupee) {
        this.griffeCoupee = griffeCoupee;
    }


    @Override
    public void Crier() {
        cri = "Miauler";
    }


    public void allInfo(){
        System.out.println(" le chat "+ cri);
        System.out.print(" nom " + super.getNom());
        System.out.print(" annif " + super.getAnnif().toString());
        System.out.print(" poids " + super.getPoids());
        System.out.print(" sexe " + super.getSexe());
        System.out.print(" taille " + super.getTaille());
        System.out.println(EstGriffeCoupee());

    }

}

