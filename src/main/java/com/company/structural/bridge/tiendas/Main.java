package com.company.structural.bridge.tiendas;

public class Main {

    public static void main(String[] args) {
        // Istancio a mi implementador puente
        VendedorEmpresasImpl tienda = new VendedorEmpresasImpl(new Tienda2Impl());

        tienda.descripcionProducto("Tv");

        VendedorParticularesImpl particular = new VendedorParticularesImpl(new Tienda3Impl());
        particular.compraProducto("Consola", 3);

    }
}
