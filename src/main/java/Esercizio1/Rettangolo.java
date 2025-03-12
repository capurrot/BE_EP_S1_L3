package Esercizio1;

import lombok.Data;


import java.util.Scanner;

@Data

public class Rettangolo {
    private double altezza;
    private double base;

    public double calcolaPerimetro() {
        return 2 * (altezza + base);
    }

    public double calcolaArea() {
        return altezza * base;
    }
}
