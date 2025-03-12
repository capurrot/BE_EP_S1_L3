package Esercizio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rettangolo {
    private double altezza;
    private double base;


    public double calcolaPerimetro() {
        return 2 * (altezza + base);
    }

    public double calcolaArea() {
        return altezza * base;
    }

    public static void stampaRettangolo() {
        Scanner scanner = new Scanner(System.in);
        Rettangolo rettangolo = new Rettangolo();
        System.out.println("Inserisci la base del rettangolo");
        rettangolo.setAltezza(scanner.nextDouble());
        System.out.println("Inserisci l'altezza del rettangolo");
        rettangolo.setBase(scanner.nextDouble());

        System.out.println("Rettangolo di altezza " + rettangolo.getAltezza() + " e base " + rettangolo.getBase());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("Area: " + rettangolo.calcolaArea());
    }

    public static void stampaDueRettangoli() {
        Scanner scanner = new Scanner(System.in);
        Rettangolo rettangolo1 = new Rettangolo();
        System.out.println("Inserisci la base del primo rettangolo");
        rettangolo1.setBase(scanner.nextDouble());
        System.out.println("Inserisci l'altezza del primo rettangolo");
        rettangolo1.setAltezza(scanner.nextDouble());

        Rettangolo rettangolo2 = new Rettangolo();
        System.out.println("Inserisci la base del secondo rettangolo");
        rettangolo2.setBase(scanner.nextDouble());
        System.out.println("Inserisci l'altezza del secondo rettangolo");
        rettangolo2.setAltezza(scanner.nextDouble());

        System.out.println("Primo rettangolo di altezza " + rettangolo1.getAltezza() + " e base " + rettangolo1.getBase());
        System.out.println("Perimetro primo rettangolo: " + rettangolo1.calcolaPerimetro());
        System.out.println("Area primo rettangolo: " + rettangolo1.calcolaArea());

        System.out.println("###################################################################à");

        System.out.println("Secondo rettangolo di altezza " + rettangolo2.getAltezza() + " e base " + rettangolo2.getBase());
        System.out.println("Perimetro secondo rettangolo: " + rettangolo2.calcolaPerimetro());
        System.out.println("Area secondo rettangolo: " + rettangolo2.calcolaArea());

        System.out.println("###################################################################à");

        System.out.println("Somma delle aree totale: " + (rettangolo1.calcolaArea() + rettangolo2.calcolaArea()));
        System.out.println("Somma perimetri totali: " + (rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro()));

    }


}
