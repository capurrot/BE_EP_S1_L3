package Esercizio2;

import lombok.Data;

@Data
public class StampaSim {
   public static void stampaSim(Sim sim) {
      System.out.println("Numero: " + sim.getNumero());
      System.out.println("Credito: " + sim.getCredito());
   }

   public static void stampaChiamata(Chiamata chiamata) {
      System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getMinuti());
   }
}
