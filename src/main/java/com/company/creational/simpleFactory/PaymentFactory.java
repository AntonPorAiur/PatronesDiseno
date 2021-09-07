package com.company.creational.simpleFactory;

/**
 * Created by albertopalomarrobledo on 15/7/19.
 */
public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment) {
        switch (typePayment) {
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            case SPEI:
                return new SpeiPayment();
            default:
                return new CardPayment();
        }
    }
}