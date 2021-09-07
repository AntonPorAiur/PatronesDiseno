package com.company.creational.simpleFactory;

public class SpeiPayment implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Aquí puedo hacer otra validación");         
        System.out.println("Pagando con transferencia Spei");    
    }
    
}
