package com.company.structural.adapter;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public interface Secure {

    // Forma en que se puede realizar un pago, debe ser transversal al tipo específico de pago
    void payWithSecureLevelA();

    void payWithSecureLevelZ();

}
