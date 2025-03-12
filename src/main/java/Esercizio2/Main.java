package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim();
        sim.setNumero("+393" + (int) (Math.random() * 900000000 + 100000000));
        sim.setCredito(0);
        StampaSim.stampaSim(sim);

        System.out.println();
        System.out.println("#################################################à");
        System.out.println();
        System.out.println("Ultime 5 chiamate:");

        Chiamata[] chiamate = new Chiamata[5];

        for (int i = 0; i < chiamate.length; i++) {
            chiamate[i] = new Chiamata();
            chiamate[i].setNumeroChiamato("+393" + (int) (Math.random() * 900000000 + 100000000));
            chiamate[i].setMinuti((int) (Math.random() * 60 + 1));
            StampaSim.stampaChiamata(chiamate[i]);
        }
    }
}
