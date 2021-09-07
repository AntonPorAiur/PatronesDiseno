package com.company.creational.prototype.card;

/**
 * Created by albertopalomarrobledo on 20/7/19.
 */
public interface PrototypeCard extends Cloneable {

    String cardNumber = "";

    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;

    default String getCardNumber() {
        return cardNumber;
    }



}