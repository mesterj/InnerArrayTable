package com.kite.joco.innerarraytable;

/**
 * Created by Mester József on 2017. 09. 13..
 */

public class Person {

    String nev;
    int eletkor;
    String kedvencSzin;

    public Person(String nev, int eletkor, String kedvencSzin) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.kedvencSzin = kedvencSzin;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public String getKedvencSzin() {
        return kedvencSzin;
    }

    public void setKedvencSzin(String kedvencSzin) {
        this.kedvencSzin = kedvencSzin;
    }
}
