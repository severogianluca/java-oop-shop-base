package org.lessons.java.shop;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    BigDecimal prezzo;
    BigDecimal iva;

    Random random = new Random();


     public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        
        this.codice = randomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public int randomCode(){
        // codice = random.nextInt(10000)
        codice = random.nextInt(99999);
        return codice;
    }

    public BigDecimal prezzoBase(){
         return this.prezzo;
    }

    public BigDecimal prezzoConIva(){
        if(prezzo != null && iva != null){
            return prezzo.add(iva).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String extendName(){
        return this.codice + "-" + this.nome;
    }

    
}
