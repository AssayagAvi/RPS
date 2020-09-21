package fr.parisnanterre.miage.rps.model;

import java.util.ArrayList;
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
        
    }

    public int getNbDeplacement(){
        return 5;
    }
}
