package com.company.creational.abstractfactory;

public class PaySchemeFactory implements AbstractFactory<PaymentScheme> {

    @Override
    public PaymentScheme create(String type) {

        if(type.equals("Cash")) {
            
            return new CashPayment();
        }

        return null;
    }
    
}
