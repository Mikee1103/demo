package com.example.demo;

public class Squadra {
    private Giocatori[] squad;
    private int pos;
    //costruttori

    //metodi
    public void aggiungi(Giocatori g){
        squad[pos]=g;
        pos++;
    }
}
