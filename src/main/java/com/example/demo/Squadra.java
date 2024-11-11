package com.example.demo;

public class Squadra {
    private Giocatori[] squad;
    private int pos;
    //costruttori
    public Squadra(){
        squad=new Giocatori[50];
        pos=0;
    }
    //metodi
    public void aggiungi(Giocatori g) {
        squad[pos] = g;
        pos++;
    }
    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < pos; i++) {
            s+=squad[i]+"\n";
        }
        return s;
        }
    }



