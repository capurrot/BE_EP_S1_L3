package Esercizio2;

import lombok.Data;

@Data
public class Sim {
    private String numero;
    private double credito;

    public void aggiungiCredito(Sim sim, double credito) {
        sim.setCredito(sim.getCredito() + credito);
    }

}






