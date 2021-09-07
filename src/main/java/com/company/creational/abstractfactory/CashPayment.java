package com.company.creational.abstractfactory;

public class CashPayment implements PaymentScheme {

    @Override
    public String getpaymentScheme() {
        return "Pago de contado";
    }
    
}
