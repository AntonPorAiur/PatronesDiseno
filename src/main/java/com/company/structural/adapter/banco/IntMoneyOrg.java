package com.company.structural.adapter.banco;

public class IntMoneyOrg implements InternationalMoneyOrganization {

    @Override
    public void transfer(int cantidad, String cliente) {
        //No esta definido y no se necesita
    }

    @Override
    public int state(String cliente) {
        return 0;
    }

}
