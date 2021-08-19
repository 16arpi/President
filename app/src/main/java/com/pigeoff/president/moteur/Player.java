package com.pigeoff.president.moteur;

import java.util.ArrayList;
import java.util.Collection;

public class Player {
    public static final int NEUTRE = 0;
    public static final int PRESIDENT = 1;
    public static final int VICE_PRESIDENT = 2;
    public static final int VICE_TROUDUCUL = 3;
    public static final int TROUDUCUL = 4;

    public int rang = 0;
    public int role = 0;
    public boolean automatic = false;
    public boolean aLaMain = false;
    public boolean couche = false;
    public Main main = new Main();

    //PRIVATE UTILE

    private void setCouche(boolean couche) {
        this.couche = couche;
    }

    // PUBLIC UTILE

    public Player(boolean automatic, int rang) {
        this.rang = rang;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setMain(boolean main) {
        this.aLaMain = main;
    }

    // ============= DEBUT DE PARTIE =============

    public void recevoirDeuxCartes(ArrayList<Carte> cartes) {
        main.addAll(cartes);
    }

    public ArrayList<Carte> donnerDeuxCartes() {
        switch (role) {
            case PRESIDENT:
                // Deux cartes les moins avantageuses
            case VICE_PRESIDENT:
                // Une carte la moins avantageuse
            case VICE_TROUDUCUL:
                // Une carte la plus forte
            case TROUDUCUL:
                // Deux cartes les plus fortes
        }

        return new ArrayList<Carte>();
    }

    // ============== JOUER LORS DU TOUR =============

    public boolean play(Pile pile) {
        return true;
    }

}
