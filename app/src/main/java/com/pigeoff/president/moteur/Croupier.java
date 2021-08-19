package com.pigeoff.president.moteur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Croupier {

    private boolean pause = false;
    private Pile pile = new Pile();
    private Defausse defausse = new Defausse();
    private Paquet paquet = new Paquet();
    private ArrayList<Player> players = new ArrayList();

    private int nbIAPlayers = 4;

    public Croupier() {

    }

    // PUBLIC METHODS

    public void launch() {
        setup();
    }

    public void pause(boolean pause) {
        this.pause = pause;
    }

    public void stop() {

    }

    //PRIVATE METHODS

    private Paquet initPaquet() {
        Paquet finalPaquet = new Paquet();
        int[] symbols = {Carte.CARREAU, Carte.COEUR, Carte.PIQUE, Carte.TREFLE};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int s : symbols) {
            for (int v : values) {
                finalPaquet.add(new Carte(v, s));
            }
        }
        return finalPaquet;
    }

    private void setup() {
        //Init paquet et mélange
        paquet = initPaquet();
        Collections.shuffle(paquet);

        //Init joueurs
        int r = 0;
        players.add(new Player(false, r));
        for (int i = 1; i <= nbIAPlayers; i++) {
            players.add(new Player(true, i));
        }

        //Distribution des cartes
        while (paquet.size() > 0) {
            for (Player p : players) {
                if (paquet.size() > 0) {
                    Carte c = paquet.get(0);
                    p.main.add(c);
                    paquet.remove(0);
                }
            }
        }


    }

    private void startPlie() {

    }

    private void startTour() {

    }
}
