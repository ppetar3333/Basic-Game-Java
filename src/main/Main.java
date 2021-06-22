package main;

import prozorZaPrikaz.Igrica;
import ucitavanje.Ucitavanje;


public class Main {

    public static final String podaciIzFajla = "rezultat.txt";

    public static void main(String[] args) {

        Ucitavanje ucitavanje = new Ucitavanje();

        ucitavanje.ucitajPodatke(podaciIzFajla);

        Igrica prozor = new Igrica(ucitavanje);
        prozor.setVisible(true);






    }
}
