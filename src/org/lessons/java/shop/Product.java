package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    //proprietà
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    //costruttore vuoto
    public Product ( ){

        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = "Nessun nome";
        this.marca = "Nessuna marca";
        this.prezzo = new BigDecimal("0");
        this.iva = new BigDecimal("0");
    } 

    //costruttore
    public Product ( String nome, String marca, BigDecimal prezzo , BigDecimal iva    ){

        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva.divide(new BigDecimal("100"),2 ,RoundingMode.HALF_UP );
    } 

    //metodi
    public int getCodice(){
        return this.codice;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public BigDecimal getPrezzoBase(){
        return this.prezzo;
    } 

    public void setPrezzoBase(BigDecimal prezzo){
        this.prezzo = prezzo;
    }

    public BigDecimal getIva(){
        return this.iva;
    }

    public void setIva(BigDecimal iva){
        this.iva = iva.divide(new BigDecimal("100"),2 ,RoundingMode.HALF_UP );
    }

    public BigDecimal getPrezzoIvato(){
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
