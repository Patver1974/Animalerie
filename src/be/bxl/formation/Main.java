package be.bxl.formation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import be.bxl.formation.Animaux.Chat;
import be.bxl.formation.Animaux.Chien;
import be.bxl.formation.Animaux.GestionAnimaux;
import be.bxl.formation.Animaux.Oiseau;

public class Main {

    public static void main(String[] args) {

	Chat chat1 = new Chat("fripon","M",1.0,1.0,"2019-04-27",false,false, "gentil");
        chat1.allInfo();
        chat1.setGriffeCoupee(true);

        chat1.allInfo();

        Chien chien1 = new Chien("medor","M",10.0,20,"2000-01-01","bleu","Berger Allementd");
        chien1.allInfo();
        Oiseau o1 = new Oiseau("Piaf","M",.5,0.5,"2010-10-11",true,"jaune canari");
        o1.allInfo();


        GestionAnimaux gestion = new GestionAnimaux();
        nouvelAnnimal(gestion);


    }

    private static void nouvelAnnimal(GestionAnimaux Gestion) {
        Scanner sc= new Scanner(System.in);
        String option;
        boolean quitter=false;
        do {
            System.out.println("q=Quitter c=Nouveau chien o=Nouveau oiseau t=Nouveau chat");
            System.out.println("Afficher  C=tous les chien O=Tous les oiseau C=Tous les chat");
            System.out.println("Afficher  TT=tous les animaux");
            System.out.println("Compter   nbrc=chien nbrt = chat  nbro=oiseau");

            option =sc.nextLine();
            switch (option){
                case "c" :// nouveau chien
                         Nouveauchien(Gestion); break;
                case "o" :// nouveau oiseau
                    NouveauOiseau(Gestion); break;
                case "t" :// nouveau chien
                    Nouveauchat(Gestion); break;
                case "T" : //Afficher tous les chats
                    Gestion.AfficherChat();break;
                    case "C" : //Afficher tous les chien
                Gestion.AfficherChien();break;
                case "O" : //Afficher tous les oiseaux
                    Gestion.AfficherOiseau();break;
                case "TT" :
                     ;break;
                case "nbrc" :
                    System.out.println(Gestion.NbrChien());break;
                case "nbrt" :
                    System.out.println(Gestion.NbrChat());break;

                case "nbro" :
                    System.out.println(Gestion.NbrOiseau()); break;

                case "q" : quitter = true;break;
            }

        }

        while(quitter==false);
Gestion.AfficherChien();
Gestion.AfficherChat();
Gestion.AfficherOiseau();



    }

    private static void Nouveauchat(GestionAnimaux Gestion) {
        Chat chat1 = new Chat("chat10","M",1.0,1.0,"2019-04-27",false,false, "gentil");
        Gestion.addChat(chat1);
        chat1.setNom("chat5");

        Gestion.addChat(chat1);
        chat1.setNom("chat2");
        Gestion.addChat(chat1);
        chat1.setNom("chat3");
        Gestion.addChat(chat1);


    }

    private static void NouveauOiseau(GestionAnimaux Gestion) {
        Oiseau oiseau1 = new Oiseau("oiseau1","M",1.0,1.0,"2019-04-27",true,"bleu");
        Gestion.addOiseau(oiseau1);
        oiseau1.setNom("oiseau2");

        Gestion.addOiseau(oiseau1);
        oiseau1.setNom("oiseau3");
        Gestion.addOiseau(oiseau1);
        oiseau1.setNom("oiseau4");
        Gestion.addOiseau(oiseau1);


    }



    private static void Nouveauchien(GestionAnimaux Gestion) {

        Chien chien1 = new Chien("Chien1","M",1.0,1.0,"2019-04-27","bleu","Berger");
        Gestion.addChien(chien1);
        chien1.setNom("chien2");

        Gestion.addChien(chien1);
        chien1.setNom("chien3");
        Gestion.addChien(chien1);
        chien1.setNom("chien4");
        Gestion.addChien(chien1);

    }
}
