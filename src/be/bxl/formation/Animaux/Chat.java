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
                double poids, Date annif, boolean poilLong, boolean griffeCoupee, String caractere) {
        super(nom, sexe, taille, poids, annif);
        this.poilLong = poilLong;
        this.griffeCoupee=griffeCoupee;
        this.caractere = caractere;

        Crier();

    }

    public String getCaractere() {
        return caractere;
    }

    public String getCri() {
        return cri;
    }
public boolean  isGriffeCoupee(){
        return griffeCoupee;

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


}

