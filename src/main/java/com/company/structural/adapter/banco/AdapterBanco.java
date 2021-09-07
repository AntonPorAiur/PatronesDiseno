package com.company.structural.adapter.banco;

import com.sun.xml.internal.ws.api.server.Adapter;

public class AdapterBanco implements InternationalMoneyOrganization {

    BancoNostrum bancoNostrum;

    public AdapterBanco(BancoNostrum bancoNostrum){
        this.bancoNostrum = bancoNostrum;
    }


    @Override
    public void transfer(int cantidad, String cliente) {
        bancoNostrum.movimiento(cliente, cantidad);
    }

    @Override
    public int state(String cliente) {
        Integer saldo = bancoNostrum.estado(cliente);

        if(saldo == null) {
            return 0;
        }else{
            return saldo;
        }
    }

}
