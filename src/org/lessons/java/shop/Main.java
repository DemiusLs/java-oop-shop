package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        Product mela = new Product("mela", "mela marlena", new BigDecimal(3), new BigDecimal(22));
        Product tartufo = new Product("tartufo", "tartufo nero", new BigDecimal(30), new BigDecimal(22));

        System.out.println("Mela");
        System.out.println(mela.getCodice());
        System.out.println(mela.getPrezzoBase());
        mela.setIva(new BigDecimal(50));
        System.out.println(mela.getIva());
        System.out.println(mela.getPrezzoIvato());
        System.out.println(mela.getFullCode());


        System.out.println("Tartufo");
        System.out.println(tartufo.getCodice());
        System.out.println(tartufo.getPrezzoBase());
        System.out.println(tartufo.getIva());
        System.out.println(tartufo.getPrezzoIvato());
        System.out.println(tartufo.getFullCode());
    }
}
