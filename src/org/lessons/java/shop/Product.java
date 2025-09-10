package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    //proprietà
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    //costruttore
    public Product ( String nome, String descrizione, BigDecimal prezzo , BigDecimal iva    ){

        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva.divide(new BigDecimal("100"),2 ,RoundingMode.HALF_UP );
    } 

    //metodi
    public int getCode(){
        return this.codice;
    }

    public BigDecimal getBasePrice(){
        return this.prezzo;
    } 

     public BigDecimal getIvaPrice(){
        if(prezzo != null && iva != null){
            return this.prezzo.add(this.prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
         
     }

    public String getFullCode(){
        if (nome != null){
            return (this.codice + "-" +  this.nome);
        }
        return null;
        
    }

}
