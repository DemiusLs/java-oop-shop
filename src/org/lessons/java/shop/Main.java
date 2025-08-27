package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        Product mela = new Product("mela", "mela marlena", new BigDecimal(3), new BigDecimal(22));
        Product tartufo = new Product("tartufo", "tartufo nero", new BigDecimal(30), new BigDecimal(22));

        System.out.println(mela.getCode());
        System.out.println(mela.getBasePrice());
        System.out.println(mela.getIvaPrice());
        System.out.println(mela.getFullCode());

        System.out.println(tartufo.getCode());
        System.out.println(tartufo.getBasePrice());
        System.out.println(tartufo.getIvaPrice());
        System.out.println(tartufo.getFullCode());
    }
}
