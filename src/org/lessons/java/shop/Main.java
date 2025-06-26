package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto playstation = new Prodotto("Ps5", "ultima generzione di console", 499.90f, 22);


        System.out.println();
        System.out.println("PRODOTTO");

        System.out.println("codice prodotto: " + playstation.codice);
        System.out.println("nome prodotto: " + playstation.nome);
        System.out.println("descrizione prodotto: " + playstation.descrizione);
        System.out.println("prezzo proddotto: " + playstation.prezzo);
        System.out.println("iva prodotto: " + playstation.iva + "%");
        playstation.prezzoBase(450.99f);
        System.out.println("prezzo proddotto base: " + playstation.prezzo);
        System.out.println("prezzo proddotto con iva: " + playstation.prezzoConIva());
        System.out.println("codice e nome: " + playstation.extendName());

    }
}
