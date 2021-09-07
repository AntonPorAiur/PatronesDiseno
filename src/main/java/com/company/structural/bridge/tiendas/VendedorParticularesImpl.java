package com.company.structural.bridge.tiendas;

public class VendedorParticularesImpl implements VendedorOnlineParticulares {

	private TiendaImpl impl;

	public VendedorParticularesImpl(TiendaImpl impl) {
		this.impl = impl;
	}

	@Override
	public String descripcionProducto(String producto) {
		// TODO Auto-generated method stub
		return "Devuelve descripcion del producto";
	}

	@Override
	public void compraProducto(String nombre, int cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Compra de producto para particular");
	}

}
