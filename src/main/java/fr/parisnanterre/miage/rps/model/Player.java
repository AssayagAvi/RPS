package fr.parisnanterre.miage.rps.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private String nom;
    private int score;
    private List<Play> deplacement = new ArrayList<>();


    Player(String nom, List<Play> deplacement) {
        this.nom = nom;
        this.deplacement = new ArrayList<>(deplacement);
        this.score = 0;
    }

     Player(String nom) {
        int cpt = getNbDeplacement();
        this.nom = nom;
        this.score = 0;
        this.deplacement = new ArrayList<>(cpt);
         for(int i = 0; i<cpt; i++) {
             deplacement.add(Play.Hasard());
         }
    }

    public int getNbDeplacement(){
        return 5;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public Play getNextMove(){
        Iterator<Play> iterator = deplacement.iterator();
        return iterator.next();

    }
}
