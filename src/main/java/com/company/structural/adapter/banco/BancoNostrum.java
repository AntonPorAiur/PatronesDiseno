package com.company.structural.adapter.banco;

public interface BancoNostrum {

	void movimiento (String cliente, int cantidad);
	
	Integer estado (String cliente);
}
