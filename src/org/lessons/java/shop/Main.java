package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto playstation = new Prodotto("Ps5",
                "ultima generzione di console",
                new BigDecimal(100),
                new BigDecimal(22));

        System.out.println();
        System.out.println("-----PRODOTTO-----");

        System.out.println("Codice e nome: " + playstation.extendName());
        System.out.println("Prezzo base: " + playstation.prezzoBase());
        System.out.println("Prezzo con iva: " + playstation.prezzoConIva());
    }
}
