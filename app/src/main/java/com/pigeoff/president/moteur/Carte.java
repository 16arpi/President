package com.pigeoff.president.moteur;

public class Carte {
    public static final int PIQUE = 1;
    public static final int COEUR = 2;
    public static final int CARREAU = 3;
    public static final int TREFLE = 4;

    int value;
    int symbol;

    public Carte(int value, int symbol) {
        setCarte(value, symbol);
    }

    public void setCarte(int value, int symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public Carte getCarte() {
        return this;
    }
}
