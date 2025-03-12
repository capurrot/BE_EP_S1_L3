package Esercizio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chiamata {
    private int minuti;
    private String numeroChiamato;
}
