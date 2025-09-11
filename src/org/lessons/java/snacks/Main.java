package org.lessons.java.snacks;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        Student stud1 = new Student("marco", "rossi", 35);
        System.out.println(stud1.getName());        
        System.out.println(stud1.getString());


        ContoBancario conto1 = new ContoBancario("damiano");
        conto1.deposito(new BigDecimal(100));
        System.out.println(conto1.getSaldo());
        conto1.prelievo(new BigDecimal(50));
        System.out.println(conto1.getSaldo());
        conto1.prelievo(new BigDecimal(51));
        System.out.println(conto1.getSaldo());
       
    }
}
