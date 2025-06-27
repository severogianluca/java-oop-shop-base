package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    Random random = new Random();

    public Prodotto() {

    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = randomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter e setter
    public int getCodice() {
        return codice;
    }

    private void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }


    //Metodi 
    public int randomCode() {
        // codice = random.nextInt(10000)
        codice = random.nextInt(99999);
        return codice;
    }

    public BigDecimal prezzoBase() {
        return this.prezzo;
    }

    public BigDecimal prezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(iva).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String extendName() {
        return this.codice + "-" + this.nome;
    }

}
