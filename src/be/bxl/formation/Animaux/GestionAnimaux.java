package be.bxl.formation.Animaux;

import java.util.ArrayList;

public class GestionAnimaux {
    private ArrayList animaux;
    private ArrayList<Oiseau> oiseau;
    private ArrayList<Chat> chat;
    private ArrayList<Chien> chien;

    public GestionAnimaux() {
        this.animaux = new ArrayList<>();
        this.chat = new ArrayList<>();
        this.chien = new ArrayList<>();
        this.oiseau = new ArrayList<>();
    }

    public void addChien(Chien vchien) {
        Chien c= new Chien(vchien);
        this.chien.add(c);
        this.animaux.add(chien);
    }

    public void addChat(Chat vchat) {
            Chat c= new Chat(vchat);
            this.chat.add(c);
            this.animaux.add(chat);
    }


public Integer NbrChien(){
        return this.chien.size();

}
    public Integer NbrChat(){
        return this.chat.size();

    }


    public Integer NbrOiseau(){
        return this.oiseau.size();

    }

    public void addOiseau(Oiseau voiseau) {
        Oiseau o = new Oiseau(voiseau);
        this.oiseau.add(o);
        this.animaux.add(oiseau);
    }

    public void AfficherChat() {
        for (Chat c : this.chat) {
            c.allInfo();
        }
    }

    public void AfficherChien() {
        for (Chien c : this.chien) {
            c.allInfo();
        }
    }

    public void AfficherOiseau() {
        for (Oiseau c : this.oiseau) {
            c.allInfo();
        }
    }


}




