package org.lessons.java.snacks;

import java.math.BigDecimal;

public class ContoBancario {

    //attributi
    private String numeroConto ;
    private BigDecimal saldo;

    //costruttore

    ContoBancario(String numeroConto ){
        this.numeroConto = numeroConto;
        saldo = new BigDecimal(0);
    }


    //metodi
    public String getConto(){
        return numeroConto;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    public void deposito(BigDecimal value){
        if(value.compareTo(BigDecimal.ZERO) > 0 ){
            this.saldo = this.saldo.add(value);
        }
    }

    public void prelievo(BigDecimal value){
        if(value.compareTo(BigDecimal.ZERO) > 0 && value.compareTo(this.saldo) <= 0 ){
           this.saldo = this.saldo.subtract(value);
        } else {
            throw new IllegalArgumentException("Errore: prelievo di " + value + " non possibile, saldo insufficiente.");
        }
         
    }


}
