package com.company.structural.decorator;

/**
 * Created by albertopalomarrobledo on 3/8/19.
 */
public class InternationalPaymentDecorator extends CreditDecorator {

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit(); // Usar el m�todo showCredit
        configInternationalPayment(); // Se agrega el config de internacional
    }

    private void configInternationalPayment() {
        System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
    }
}
