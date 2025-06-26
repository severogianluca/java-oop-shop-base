package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;

    Random random = new Random();


     public Prodotto(String nome, String descrizione, float prezzo, int iva){
        
        this.codice = randomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public int randomCode(){
        // codice = random.nextInt(10000)
        codice = 10000 + random.nextInt(90000);
        return codice;
    }

    public void prezzoBase(float prezzo){
        this.prezzo = prezzo;
    }

    public float prezzoConIva(){
        float tot = this.prezzo + (this.prezzo * this.iva)/100;
        return tot;
    }

    public String extendName(){
        return this.codice + "-" + this.nome;
    }

    
}
